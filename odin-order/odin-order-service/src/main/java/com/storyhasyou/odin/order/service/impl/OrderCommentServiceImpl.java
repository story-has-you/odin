package com.storyhasyou.odin.order.service.impl;

import com.storyhasyou.odin.order.mapper.OrderCommentMapper;
import com.storyhasyou.odin.order.pojo.entity.OrderComment;
import com.storyhasyou.odin.order.service.interfaces.OrderCommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author fangxi created by 2023/1/5
 */
@Service
@RequiredArgsConstructor
public class OrderCommentServiceImpl implements OrderCommentService {

    private final OrderCommentMapper orderCommentMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return orderCommentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(OrderComment record) {
        return orderCommentMapper.insertSelective(record);
    }

    @Override
    public OrderComment selectByPrimaryKey(Long id) {
        return orderCommentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(OrderComment record) {
        return orderCommentMapper.updateByPrimaryKeySelective(record);
    }

}
