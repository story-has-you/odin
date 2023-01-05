package com.storyhasyou.odin.order.mapper;

import com.storyhasyou.odin.order.pojo.entity.Order;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author fangxi created by 2023/1/5
 */
@Mapper
public interface OrderMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Order record);
}