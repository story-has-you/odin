package com.storyhasyou.odin.driver.pojo.model;

/**
 * @author fangxi created by 2022/12/30
 */
public record DriverSettingsModel(String orientation, Boolean listenService, Integer orderDistance,
                                  Integer rangeDistance, Boolean autoAccept) {


}
