package com.storyhasyou.odin.driver.pojo.model;

import lombok.Data;

/**
 * @author fangxi created by 2022/12/30
 */
@Data
public class DriverSettingsModel {

    /**
     * 定向接单目的地
     */
    private String orientation;
    /**
     * 自动听单
     */
    private Boolean listenService;
    /**
     * 订单的距离，0为不限制，单位公里
     */
    private Integer orderDistance;
    /**
     * 距离范围，0为不限制，单位公里
     */
    private Integer rangeDistance;
    /**
     * 自动接受
     */
    private Boolean autoAccept;

    public DriverSettingsModel() {
        this.orientation = "";
        this.listenService = true;
        this.orderDistance = 0;
        this.rangeDistance = 5;
        this.autoAccept = false;
    }

}
