package com.walker.consumer.client;


import com.walker.consumer.fallback.MakeFallBack;
import com.walker.consumer.fallback.MakeFallBackFactory;
import com.walker.entity.MakeOrder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "spring-boot-demo-provider-make" ,fallback = MakeFallBack.class)
//@FeignClient(name = "spring-boot-demo-provider-make" ,fallbackFactory = MakeFallBackFactory.class)
public interface MakeClient {

    @RequestMapping(value = "/make/list",method = RequestMethod.GET)
    public List<MakeOrder> list();

    @RequestMapping(value = "/make/get/{id}",method = RequestMethod.GET)
    public MakeOrder get(@PathVariable(value = "id") String id);

}
