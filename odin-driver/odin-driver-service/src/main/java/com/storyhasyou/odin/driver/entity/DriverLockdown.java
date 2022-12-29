package com.storyhasyou.odin.driver.entity;

import com.storyhasyou.kratos.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

/**
 * @author fangxi created by 2022/12/29
 */

/**
 * 司机禁闭表（禁止接单）
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DriverLockdown extends BaseEntity {
    /**
     * 司机ID
     */
    private Long driverId;

    /**
     * 原因
     */
    private String reason;

    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 起始日期
     */
    private LocalDate startDate;

    /**
     * 结束日期
     */
    private LocalDate endDate;

    /**
     * 天数
     */
    private Integer days;
}
