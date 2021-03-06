package com.walker.consumer.controller;

import com.walker.entity.MakeOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * 预定消费者
 * @Author: yangcaoyuan
 * @Date: 2019/9/6 17:40
 * @Version V1.0
 */
@RestController
public class MakeServiceController {

//    private static final String REST_URL_PREFIX = "http://localhost:8001";
    private static final String REST_URL_PREFIX = "http://spring-boot-demo-provider-make";

    /**
     *使用
      使用restTemplate访问restful接口非常的简单粗暴无脑。
      (url, requestMap, ResponseBeannclass )这三个参数分别代表REST请求地址、请求参数、HTTP响应转换被转换成的对象类型。
     */
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consumer/make/list",method = RequestMethod.GET)
    public List<MakeOrder> list() {
        return restTemplate.getForObject(REST_URL_PREFIX+"/make/list",List.class);
    }

    @RequestMapping(value = "/consumer/make/get/{id}",method = RequestMethod.GET)
    public MakeOrder get(@PathVariable(value = "id") String id) {
        return restTemplate.getForObject(REST_URL_PREFIX+"/make/get/"+id,MakeOrder.class);
    }

 }
