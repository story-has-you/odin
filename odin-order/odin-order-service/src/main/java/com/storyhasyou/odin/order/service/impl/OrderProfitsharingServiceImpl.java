package com.storyhasyou.odin.order.service.impl;

import com.storyhasyou.odin.order.mapper.OrderProfitsharingMapper;
import com.storyhasyou.odin.order.pojo.entity.OrderProfitsharing;
import com.storyhasyou.odin.order.service.interfaces.OrderProfitsharingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author fangxi created by 2023/1/5
 */
@Service
@RequiredArgsConstructor
public class OrderProfitsharingServiceImpl implements OrderProfitsharingService {

    private final OrderProfitsharingMapper orderProfitsharingMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return orderProfitsharingMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(OrderProfitsharing record) {
        return orderProfitsharingMapper.insertSelective(record);
    }

    @Override
    public OrderProfitsharing selectByPrimaryKey(Long id) {
        return orderProfitsharingMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(OrderProfitsharing record) {
        return orderProfitsharingMapper.updateByPrimaryKeySelective(record);
    }

}
