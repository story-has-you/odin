package com.storyhasyou.odin.driver.pojo.entity;

import com.storyhasyou.kratos.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

/**
 * @author fangxi created by 2022/12/29
 */

/**
 * 司机人脸识别表
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DriverRecognition extends BaseEntity {
    /**
     * 司机ID
     */
    private Long driverId;

    /**
     * 检测日期
     */
    private LocalDate date;
}
