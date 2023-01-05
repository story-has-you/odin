package com.storyhasyou.odin.order.mapper;

import com.storyhasyou.odin.order.pojo.entity.OrderMonitoring;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author fangxi created by 2023/1/5
 */
@Mapper
public interface OrderMonitoringMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(OrderMonitoring record);

    OrderMonitoring selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderMonitoring record);
}