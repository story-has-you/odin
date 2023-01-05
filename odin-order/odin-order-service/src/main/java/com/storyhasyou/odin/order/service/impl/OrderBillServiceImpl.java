package com.storyhasyou.odin.order.service.impl;

import com.storyhasyou.odin.order.mapper.OrderBillMapper;
import com.storyhasyou.odin.order.pojo.entity.OrderBill;
import com.storyhasyou.odin.order.service.interfaces.OrderBillService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author fangxi created by 2023/1/5
 */
@Service
@RequiredArgsConstructor
public class OrderBillServiceImpl implements OrderBillService {

    private final OrderBillMapper orderBillMapper;


    @Override
    public int deleteByPrimaryKey(Long id) {
        return orderBillMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(OrderBill record) {
        return orderBillMapper.insertSelective(record);
    }

    @Override
    public OrderBill selectByPrimaryKey(Long id) {
        return orderBillMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(OrderBill record) {
        return orderBillMapper.updateByPrimaryKeySelective(record);
    }

}
