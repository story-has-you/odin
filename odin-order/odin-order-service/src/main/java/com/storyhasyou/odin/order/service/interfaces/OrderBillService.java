package com.storyhasyou.odin.order.service.interfaces;

import com.storyhasyou.odin.order.pojo.entity.OrderBill;

/**
 * @author fangxi created by 2023/1/5
 */
public interface OrderBillService {


    int deleteByPrimaryKey(Long id);

    int insertSelective(OrderBill record);

    OrderBill selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderBill record);

}

