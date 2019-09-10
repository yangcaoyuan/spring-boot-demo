package com.walker.provider.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.walker.entity.MakeOrder;
import com.walker.provider.dao.MakeOrderDao;
import com.walker.provider.service.MakeOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 预定接口实现
 * @Author: yangcaoyuan
 * @Date: 2019/9/6 16:31
 * @Version V1.0
 */
@Service
public class MakeOrderServiceImpl implements MakeOrderService {

    @Autowired
    private MakeOrderDao makeOrderDao;

    @Override
    public List<MakeOrder> selectList(JSONObject param) {
        List<MakeOrder> list = null;
        try {
            //分页
            Integer pageNum = param.getInteger("pageNum");
            pageNum = pageNum==null?1:pageNum;
            Integer pageSize = param.getInteger("pageSize");
            pageSize = pageSize==null?10:pageSize;
            PageHelper.startPage(pageNum,pageSize);
            PageInfo<MakeOrder> pages = new PageInfo<>(makeOrderDao.selectList());
            list = pages.getList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public MakeOrder select(String id) {
        return makeOrderDao.selectByPrimaryKey(id);
    }
}
