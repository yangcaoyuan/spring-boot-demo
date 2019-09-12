package com.walker.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class ConsumerHystrixDashboard_9002 {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerHystrixDashboard_9002.class,args);
    }

}
