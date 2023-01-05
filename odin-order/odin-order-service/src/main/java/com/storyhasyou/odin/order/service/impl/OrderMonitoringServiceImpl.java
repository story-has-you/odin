package com.storyhasyou.odin.order.service.impl;

import com.storyhasyou.odin.order.mapper.OrderMonitoringMapper;
import com.storyhasyou.odin.order.pojo.entity.OrderMonitoring;
import com.storyhasyou.odin.order.service.interfaces.OrderMonitoringService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author fangxi created by 2023/1/5
 */
@Service
@RequiredArgsConstructor
public class OrderMonitoringServiceImpl implements OrderMonitoringService {

    private final OrderMonitoringMapper orderMonitoringMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return orderMonitoringMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(OrderMonitoring record) {
        return orderMonitoringMapper.insertSelective(record);
    }

    @Override
    public OrderMonitoring selectByPrimaryKey(Long id) {
        return orderMonitoringMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(OrderMonitoring record) {
        return orderMonitoringMapper.updateByPrimaryKeySelective(record);
    }

}
