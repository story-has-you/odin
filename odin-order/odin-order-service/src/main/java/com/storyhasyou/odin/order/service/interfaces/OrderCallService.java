package com.storyhasyou.odin.order.service.interfaces;

import com.storyhasyou.odin.order.pojo.entity.OrderCall;

/**
 * @author fangxi created by 2023/1/5
 */
public interface OrderCallService {


    int deleteByPrimaryKey(Long id);

    int insertSelective(OrderCall record);

    OrderCall selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderCall record);

}

