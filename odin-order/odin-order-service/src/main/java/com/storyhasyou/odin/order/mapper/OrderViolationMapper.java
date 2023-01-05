package com.storyhasyou.odin.order.mapper;

import com.storyhasyou.odin.order.pojo.entity.OrderViolation;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author fangxi created by 2023/1/5
 */
@Mapper
public interface OrderViolationMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(OrderViolation record);

    OrderViolation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderViolation record);
}