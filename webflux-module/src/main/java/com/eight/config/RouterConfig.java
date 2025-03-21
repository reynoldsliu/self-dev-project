package com.eight.config;

import com.eight.handler.TimeHandler;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;


@Configuration
public class RouterConfig {
    private final TimeHandler timeHandler;
    public RouterConfig(TimeHandler timeHandler) {
        this.timeHandler = timeHandler;
    }

    @Bean
    public RouterFunction<ServerResponse> router() {
        return RouterFunctions.route()
                .GET("/time", this.timeHandler::getTime)
                .GET("/date", this.timeHandler::getDate)
                .build();
    }
}
