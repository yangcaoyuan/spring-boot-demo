package com.walker.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulGateway_6001 {

    public static void main(String[] args) {
        SpringApplication.run(ZuulGateway_6001.class,args);
    }

}
