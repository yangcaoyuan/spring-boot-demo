package com.walker.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;


@SpringBootApplication
@EnableCircuitBreaker //对Hystrix熔断器机制的支持
public class ProviderMakeHystrix_8001 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderMakeHystrix_8001.class, args);
    }
}
