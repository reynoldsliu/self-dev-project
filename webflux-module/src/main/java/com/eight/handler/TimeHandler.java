package com.eight.handler;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.time.LocalDate;
import java.time.LocalTime;

@Component
public class TimeHandler {
    public Mono<ServerResponse> getTime(ServerRequest request) {
        return ServerResponse.ok()
                .contentType(MediaType.TEXT_PLAIN)
                .bodyValue(LocalTime.now().toString());
    }

    public Mono<ServerResponse> getDate(ServerRequest request) {
        return ServerResponse.ok()
                .contentType(MediaType.TEXT_PLAIN)
                .bodyValue(LocalDate.now().toString());
    }
}
