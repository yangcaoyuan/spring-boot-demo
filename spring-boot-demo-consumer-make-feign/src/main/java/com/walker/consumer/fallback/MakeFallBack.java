package com.walker.consumer.fallback;

import com.walker.consumer.client.MakeClient;
import com.walker.entity.MakeOrder;

import java.util.List;

/**
 * @Author: yangcaoyuan
 * @Date: 2019/9/10 17:26
 * @Version V1.0
 */
public class MakeFallBack implements MakeClient {
    @Override
    public List<MakeOrder> list() {
        return null;
    }

    @Override
    public MakeOrder get(String id) {
        return null;
    }
}
