package com.example.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class HystrixFallbackRestController {

    @GetMapping("/service1/fallback")
    public Mono<String> getS1SvcMsg() {
        return Mono.just("No response from service1 and will back shortly");
    }
}
