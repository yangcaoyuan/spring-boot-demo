package com.walker.provider.service;

import com.alibaba.fastjson.JSONObject;
import com.walker.entity.MakeOrder;

import java.util.List;

/**
 * 预定接口
 * @Author: yangcaoyuan
 * @Date: 2019/9/6 16:29
 * @Version V1.0
 */
public interface MakeOrderService {

    List<MakeOrder> selectList(JSONObject param);

    MakeOrder select(String id);
}
