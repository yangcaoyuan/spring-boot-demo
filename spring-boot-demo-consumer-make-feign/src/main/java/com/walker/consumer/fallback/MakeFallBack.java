package com.walker.consumer.fallback;

import com.walker.consumer.client.MakeClient;
import com.walker.entity.MakeOrder;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MakeFallBack implements MakeClient {
    @Override
    public List<MakeOrder> list() {
        return null;
    }

    @Override
    public MakeOrder get(String id) {
        MakeOrder makeOrder = new MakeOrder();
        makeOrder.setId(id+"没有对应信息null--Fallback");
        return makeOrder;
    }
}
