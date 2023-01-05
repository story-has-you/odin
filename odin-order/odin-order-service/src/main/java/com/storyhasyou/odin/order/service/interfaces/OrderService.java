package com.storyhasyou.odin.order.service.interfaces;

import com.storyhasyou.odin.order.pojo.entity.Order;

/**
 * @author fangxi created by 2023/1/5
 */
public interface OrderService {


    int deleteByPrimaryKey(Long id);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Order record);

}


