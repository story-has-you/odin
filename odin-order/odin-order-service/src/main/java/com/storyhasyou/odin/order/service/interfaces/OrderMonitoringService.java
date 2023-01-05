package com.storyhasyou.odin.order.service.interfaces;

import com.storyhasyou.odin.order.pojo.entity.OrderMonitoring;

/**
 * @author fangxi created by 2023/1/5
 */
public interface OrderMonitoringService {


    int deleteByPrimaryKey(Long id);

    int insertSelective(OrderMonitoring record);

    OrderMonitoring selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderMonitoring record);

}

