package com.storyhasyou.odin.order.service.impl;

import com.storyhasyou.odin.order.mapper.OrderMapper;
import com.storyhasyou.odin.order.pojo.entity.Order;
import com.storyhasyou.odin.order.service.interfaces.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author fangxi created by 2023/1/5
 */
@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderMapper orderMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return orderMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(Order record) {
        return orderMapper.insertSelective(record);
    }

    @Override
    public Order selectByPrimaryKey(Long id) {
        return orderMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Order record) {
        return orderMapper.updateByPrimaryKeySelective(record);
    }

}
