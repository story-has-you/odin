package com.storyhasyou.odin.order.mapper;

import com.storyhasyou.odin.order.pojo.entity.OrderBill;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author fangxi created by 2023/1/5
 */
@Mapper
public interface OrderBillMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(OrderBill record);

    OrderBill selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderBill record);
}