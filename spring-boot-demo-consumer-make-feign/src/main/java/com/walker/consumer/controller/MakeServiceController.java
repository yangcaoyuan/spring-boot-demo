package com.walker.consumer.controller;

import com.walker.consumer.client.MakeClient;
import com.walker.entity.MakeOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 预定消费者
 * @Author: yangcaoyuan
 * @Date: 2019/9/6 17:40
 * @Version V1.0
 */
@RestController
public class MakeServiceController {

    @Autowired
    private MakeClient makeClient;

    @RequestMapping(value = "/consumer/make/list",method = RequestMethod.GET)
    public List<MakeOrder> list() {
        return makeClient.list();
    }

    @RequestMapping(value = "/consumer/make/get/{id}",method = RequestMethod.GET)
    public MakeOrder get(@PathVariable(value = "id") String id) {
        return makeClient.get(id);
    }

 }
