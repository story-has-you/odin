package com.storyhasyou.odin.order.service.interfaces;

import com.storyhasyou.odin.order.pojo.entity.OrderAppeal;

/**
 * @author fangxi created by 2023/1/5
 */
public interface OrderAppealService {


    int deleteByPrimaryKey(Long id);

    int insertSelective(OrderAppeal record);

    OrderAppeal selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderAppeal record);

}

