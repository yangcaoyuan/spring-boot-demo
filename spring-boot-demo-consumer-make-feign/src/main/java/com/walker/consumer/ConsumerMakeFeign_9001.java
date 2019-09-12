package com.walker.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker //对Hystrix熔断器机制的支持
@EnableHystrixDashboard
public class ConsumerMakeFeign_9001 {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerMakeFeign_9001.class,args);
    }

}
