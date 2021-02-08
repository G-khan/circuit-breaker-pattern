package com.gokhana.circuitbreaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@EnableCircuitBreaker
@SpringBootApplication
public class CircuitBreakerPatternApplication {

    public static void main(String[] args) {
        SpringApplication.run(CircuitBreakerPatternApplication.class, args);
    }

}
