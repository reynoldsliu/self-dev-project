package com.eight;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;
import reactor.core.Disposable;
import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;
import reactor.util.function.Tuple2;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * ref:
 * https://liakh-aliaksandr.medium.com/server-sent-events-sse-in-spring-5-with-web-mvc-and-web-flux-44c926b59f36
 */
@CrossOrigin(origins = "*")
@RestController
public class Controller {

    private static final String[] WORDS = "The quick brown fox jumps over the lazy dog.".split(" ");

    private SseEmitter emitter;

    private final ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

    @GetMapping(path = "/sse/sseEmitter", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    SseEmitter createConnection() {
        emitter = new SseEmitter();

        emitter.onCompletion(() -> {
            try {
                emitter.send("Done.");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        emitter.onError((err) -> {
            try {
                emitter.send(err.toString());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        emitter.onTimeout(() -> {
            try {
                emitter.send("Timeout");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        cachedThreadPool.execute(() -> {
            try {
                for (int i = 0; i < WORDS.length; i++) {
                    emitter.send(WORDS[i]);
                    TimeUnit.SECONDS.sleep(1);
                }
                emitter.complete();
            } catch (Exception e) {
                emitter.completeWithError(e);
            }
        });

        return emitter;
    }

    @RequestMapping(value = "/sse", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<?> api() {
        return Flux
                .zip(Flux.just(WORDS),
                        Flux.interval(Duration.ofSeconds(1)))
                .map(Tuple2::getT1);
    }

    public Flux<?> api2() {
        Disposable subscribeDisposable = Flux.range(1, 10).parallel(2)
                .runOn(Schedulers.parallel()).subscribe(System.out::println);
        subscribeDisposable.dispose();
        Flux<Integer> flux = Flux.range(0, 10)
                .publishOn(Schedulers.newSingle("single thread-1"))
                .map(i -> {System.out.println("Mapping for " + i + " is done by thread " + Thread.currentThread().getName());
                    return i;
                });
//        flux.subscribeOn(Schedulers
        return Flux.just("done.");
    }
}
