package com.storyhasyou.odin.order.service.impl;

import com.storyhasyou.odin.order.mapper.OrderViolationMapper;
import com.storyhasyou.odin.order.pojo.entity.OrderViolation;
import com.storyhasyou.odin.order.service.interfaces.OrderViolationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author fangxi created by 2023/1/5
 */
@Service
@RequiredArgsConstructor
public class OrderViolationServiceImpl implements OrderViolationService {

    private final OrderViolationMapper orderViolationMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return orderViolationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(OrderViolation record) {
        return orderViolationMapper.insertSelective(record);
    }

    @Override
    public OrderViolation selectByPrimaryKey(Long id) {
        return orderViolationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(OrderViolation record) {
        return orderViolationMapper.updateByPrimaryKeySelective(record);
    }

}
