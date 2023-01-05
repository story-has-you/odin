package com.storyhasyou.odin.order.service.interfaces;

import com.storyhasyou.odin.order.pojo.entity.OrderViolation;

/**
 * @author fangxi created by 2023/1/5
 */
public interface OrderViolationService {


    int deleteByPrimaryKey(Long id);

    int insertSelective(OrderViolation record);

    OrderViolation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderViolation record);

}

