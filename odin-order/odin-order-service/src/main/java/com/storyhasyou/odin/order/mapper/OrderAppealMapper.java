package com.storyhasyou.odin.order.mapper;

import com.storyhasyou.odin.order.pojo.entity.OrderAppeal;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author fangxi created by 2023/1/5
 */
@Mapper
public interface OrderAppealMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(OrderAppeal record);

    OrderAppeal selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderAppeal record);
}