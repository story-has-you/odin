package com.storyhasyou.odin.driver.entity;

import com.storyhasyou.kratos.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author fangxi created by 2022/12/29
 * 司机设置表
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DriverSettings extends BaseEntity {
    /**
     * 司机ID
     */
    private Long driverId;

    /**
     * 个人设置
     */
    private String settings;
}
