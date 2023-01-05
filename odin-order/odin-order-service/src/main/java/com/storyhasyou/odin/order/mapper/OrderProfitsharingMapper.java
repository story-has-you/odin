package com.storyhasyou.odin.order.mapper;

import com.storyhasyou.odin.order.pojo.entity.OrderProfitsharing;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author fangxi created by 2023/1/5
 */
@Mapper
public interface OrderProfitsharingMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(OrderProfitsharing record);

    OrderProfitsharing selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderProfitsharing record);
}