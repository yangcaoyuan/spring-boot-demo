package com.walker.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker //对Hystrix熔断器机制的支持
public class ConsumerMakeFeign_80 {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerMakeFeign_80.class,args);
    }

}
