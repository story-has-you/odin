package com.storyhasyou.odin.order.service.impl;

import com.storyhasyou.odin.order.mapper.OrderAppealMapper;
import com.storyhasyou.odin.order.pojo.entity.OrderAppeal;
import com.storyhasyou.odin.order.service.interfaces.OrderAppealService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author fangxi created by 2023/1/5
 */
@Service
@RequiredArgsConstructor
public class OrderAppealServiceImpl implements OrderAppealService {

    private final OrderAppealMapper orderAppealMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return orderAppealMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(OrderAppeal record) {
        return orderAppealMapper.insertSelective(record);
    }

    @Override
    public OrderAppeal selectByPrimaryKey(Long id) {
        return orderAppealMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(OrderAppeal record) {
        return orderAppealMapper.updateByPrimaryKeySelective(record);
    }

}
