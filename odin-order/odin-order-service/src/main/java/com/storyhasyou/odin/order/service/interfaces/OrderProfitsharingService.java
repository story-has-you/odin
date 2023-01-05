package com.storyhasyou.odin.order.service.interfaces;

import com.storyhasyou.odin.order.pojo.entity.OrderProfitsharing;

/**
 * @author fangxi created by 2023/1/5
 */
public interface OrderProfitsharingService {


    int deleteByPrimaryKey(Long id);

    int insertSelective(OrderProfitsharing record);

    OrderProfitsharing selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderProfitsharing record);

}

