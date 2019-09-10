package com.walker.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule() {
//        return new RandomRule();//Ribbon默认是轮询，我自定义随机
        return new RandomRule_MY();//Ribbon默认是轮询，我自定义规则类
    }

}
