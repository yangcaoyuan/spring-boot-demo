package com.walker.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = {"com.walker"})
public class ConsumerMakeFeign_80 {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerMakeFeign_80.class,args);
    }

}
