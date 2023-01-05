package com.storyhasyou.odin.order.pojo.entity;

import com.storyhasyou.kratos.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author fangxi created by 2023/1/5
 * 订单评价表
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OrderComment extends BaseEntity {
    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 司机ID
     */
    private Long driverId;

    /**
     * 顾客ID
     */
    private Long customerId;

    /**
     * 评分，1星~5星
     */
    private Integer rate;

    /**
     * 差评备注
     */
    private String remark;

    /**
     * 状态，1未申诉，2已申诉，3申诉失败，4申诉成功
     */
    private Integer status;

    /**
     * 申诉工作流ID
     */
    private String instanceId;
}
