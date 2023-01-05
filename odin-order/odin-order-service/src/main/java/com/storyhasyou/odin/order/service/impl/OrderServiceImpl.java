package com.storyhasyou.odin.order.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.storyhasyou.odin.order.feign.DriverFeginClient;
import com.storyhasyou.odin.order.mapper.OrderMapper;
import com.storyhasyou.odin.order.pojo.model.OrderSummary;
import com.storyhasyou.odin.order.pojo.vo.response.WorkTableResponseVO;
import com.storyhasyou.odin.order.service.interfaces.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author fangxi created by 2023/1/5
 */
@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderMapper orderMapper;
    private final DriverFeginClient driverFeginClient;


    @Override
    public WorkTableResponseVO selectWorkTable(long driverId) {
        OrderSummary orderSummary = orderMapper.selectTodayOrderSummary(driverId);
        WorkTableResponseVO workTableResponseVO = BeanUtil.toBean(orderSummary, WorkTableResponseVO.class);
        driverFeginClient.selectDriverSettings(driverId)
                .servcieData(driverSettingsDTO -> {
                    BeanUtil.copyProperties(driverSettingsDTO, workTableResponseVO);
                });
        return workTableResponseVO;
    }
}
