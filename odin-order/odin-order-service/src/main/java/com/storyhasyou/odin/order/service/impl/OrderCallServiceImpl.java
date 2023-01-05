package com.storyhasyou.odin.order.service.impl;

import com.storyhasyou.odin.order.mapper.OrderCallMapper;
import com.storyhasyou.odin.order.pojo.entity.OrderCall;
import com.storyhasyou.odin.order.service.interfaces.OrderCallService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author fangxi created by 2023/1/5
 */
@Service
@RequiredArgsConstructor
public class OrderCallServiceImpl implements OrderCallService {

    private final OrderCallMapper orderCallMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return orderCallMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(OrderCall record) {
        return orderCallMapper.insertSelective(record);
    }

    @Override
    public OrderCall selectByPrimaryKey(Long id) {
        return orderCallMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(OrderCall record) {
        return orderCallMapper.updateByPrimaryKeySelective(record);
    }

}
