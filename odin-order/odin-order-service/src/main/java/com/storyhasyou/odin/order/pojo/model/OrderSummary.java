package com.storyhasyou.odin.order.pojo.model;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author fangxi created by 2023/1/5
 */
@Data
public class OrderSummary {

    private Integer drivingDuration;
    private BigDecimal todayIncome;
    private Integer todayOrderCount;

}
