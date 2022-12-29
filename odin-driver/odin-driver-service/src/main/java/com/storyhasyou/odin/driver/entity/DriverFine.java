package com.storyhasyou.odin.driver.entity;

import com.storyhasyou.kratos.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * @author fangxi created by 2022/12/29
 * 司机罚款表
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DriverFine extends BaseEntity {
    /**
     * 司机ID
     */
    private Long driverId;

    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 罚款金额
     */
    private BigDecimal amount;

    /**
     * 备注信息
     */
    private String remark;

    /**
     * 1未缴纳，2已缴纳
     */
    private Integer status;
}
