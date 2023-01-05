package com.storyhasyou.odin.order.mapper;

import com.storyhasyou.odin.order.pojo.entity.OrderCall;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author fangxi created by 2023/1/5
 */
@Mapper
public interface OrderCallMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(OrderCall record);

    OrderCall selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderCall record);
}