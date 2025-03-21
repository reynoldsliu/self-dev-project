package com.eight;

// Backend implementation using Spring Boot
// file: DataController.java

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class DataController {

    private final ExecutorService executorService = Executors.newCachedThreadPool();

    // Regular REST endpoint for fetch requests
    @GetMapping("/data")
    public ResponseEntity<Map<String, Object>> getData() {
        Map<String, Object> data = new HashMap<>();
        data.put("message", "Hello from server!");
        data.put("timestamp", System.currentTimeMillis());

        return ResponseEntity.ok(data);
    }

    // SSE endpoint
    @GetMapping("/sse-stream")
    public SseEmitter streamEvents() {
        SseEmitter emitter = new SseEmitter(Long.MAX_VALUE);

        executorService.execute(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    // Send regular messages
                    emitter.send(SseEmitter.event()
                            .data(Map.of("count", i, "time", System.currentTimeMillis()))
                            .build());

                    // Send custom event
                    emitter.send(SseEmitter.event()
                            .name("custom-event")
                            .data(Map.of("customData", "Event " + i))
                            .build());

                    Thread.sleep(1000);
                }

                emitter.complete();

            } catch (IOException | InterruptedException e) {
                emitter.completeWithError(e);
            }
        });

        // Handle client disconnection
        emitter.onCompletion(() -> System.out.println("SSE completed"));
        emitter.onTimeout(() -> System.out.println("SSE timeout"));
        emitter.onError((ex) -> System.out.println("SSE error: " + ex.getMessage()));

        return emitter;
    }
}
