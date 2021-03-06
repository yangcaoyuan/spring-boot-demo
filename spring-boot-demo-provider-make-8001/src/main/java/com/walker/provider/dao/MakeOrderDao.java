package com.walker.provider.dao;


import com.walker.entity.MakeOrder;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MakeOrderDao {
    /**
     * 根据主键删除
     * 参数:主键
     * 返回:删除个数
     * @author: lying
     * @time: 2019-09-06 11:23:18
     */
    int deleteByPrimaryKey(String id);

    /**
     * 插入，空属性也会插入
     * 参数:pojo对象
     * 返回:删除个数
     * @author: lying
     * @time: 2019-09-06 11:23:18
     */
    int insert(MakeOrder record);

    /**
     * 插入，空属性不会插入
     * 参数:pojo对象
     * 返回:删除个数
     * @author: lying
     * @time: 2019-09-06 11:23:18
     */
    int insertSelective(MakeOrder record);

    /**
     * 根据主键查询
     * 参数:查询条件,主键值
     * 返回:对象
     * @author: lying
     * @time: 2019-09-06 11:23:18
     */
    MakeOrder selectByPrimaryKey(String id);

    /**
     * 根据主键修改，空值条件不会修改成null
     * 参数:1.要修改成的值
     * 返回:成功修改个数
     * @author: lying
     * @time: 2019-09-06 11:23:18
     */
    int updateByPrimaryKeySelective(MakeOrder record);

    /**
     * 根据主键修改，空值条件会修改成null
     * 参数:1.要修改成的值
     * 返回:成功修改个数
     * @author: lying
     * @time: 2019-09-06 11:23:18
     */
    int updateByPrimaryKey(MakeOrder record);








    /**
      * 查询列表
      * @author: yangcaoyuan
      * @date: 2019/9/6 16:40
    */
    List<MakeOrder> selectList();
}