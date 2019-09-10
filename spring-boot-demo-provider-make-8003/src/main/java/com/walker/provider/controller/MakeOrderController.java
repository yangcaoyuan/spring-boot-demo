package com.walker.provider.controller;

import com.alibaba.fastjson.JSONObject;
import com.walker.entity.MakeOrder;
import com.walker.provider.service.MakeOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 预定
 * @Author: yangcaoyuan
 * @Date: 2019/9/6 16:28
 * @Version V1.0
 */
@RestController
public class MakeOrderController {

    @Autowired
    private MakeOrderService makeOrderService;

    @RequestMapping(value = "/make/list", method = RequestMethod.GET)
    public List<MakeOrder> list(String params) {
        JSONObject param = new JSONObject();
        if(!StringUtils.isEmpty(params)) {
            param = JSONObject.parseObject(params);
        }
        return makeOrderService.selectList(param);
    }

    @RequestMapping(value = "/make/get/{id}",method = RequestMethod.GET)
    public MakeOrder get(@PathVariable(value = "id") String id) {
        return makeOrderService.select(id);
    }

}
