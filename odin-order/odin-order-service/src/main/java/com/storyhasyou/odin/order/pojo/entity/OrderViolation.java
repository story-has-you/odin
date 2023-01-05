package com.storyhasyou.odin.order.pojo.entity;

import com.storyhasyou.kratos.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author fangxi created by 2023/1/5
 * 订单违规表
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OrderViolation extends BaseEntity {
    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 司机ID
     */
    private Long driverId;

    /**
     * 违纪类型，1服务，2驾驶
     */
    private Integer type;

    /**
     * 违纪原因
     */
    private String reason;

    /**
     * 状态，1未申诉，2已申诉，3申诉失败，4申诉成功
     */
    private Integer status;

    /**
     * 申诉工作流实例ID
     */
    private String instanceId;
}
