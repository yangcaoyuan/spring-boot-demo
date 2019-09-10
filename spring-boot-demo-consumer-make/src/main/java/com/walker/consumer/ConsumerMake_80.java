package com.walker.consumer;

import com.walker.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication

//在启动该微服务的时候就能去加载我们的自定义Ribbon配置类,从而使配置生效

@RibbonClient(name = "SPRING-BOOT-DEMO-PROVIDER-MAKE",configuration = MySelfRule.class)
public class ConsumerMake_80 {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerMake_80.class,args);
    }

}
