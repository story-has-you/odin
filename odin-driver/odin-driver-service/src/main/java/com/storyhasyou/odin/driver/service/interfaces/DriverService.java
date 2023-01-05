package com.storyhasyou.odin.driver.service.interfaces;

import com.storyhasyou.odin.driver.pojo.model.CurrentDriver;
import com.storyhasyou.odin.driver.pojo.vo.request.RegisterDriverRequestVO;
import com.storyhasyou.odin.driver.pojo.vo.request.UpdateDriverRequestVO;
import com.storyhasyou.odin.driver.pojo.vo.response.DriverResponseVO;
import com.storyhasyou.odin.driver.pojo.vo.response.DriverSettingsResponseVO;

/**
 * @author fangxi created by 2022/12/29
 */
public interface DriverService {

    String register(RegisterDriverRequestVO requestVO);

    String uploadDriverPhoto(byte[] content);

    boolean updateDriverInfo(UpdateDriverRequestVO requestVO);

    CurrentDriver login(String openId);

    DriverResponseVO selectById(long driverId);

    DriverSettingsResponseVO selectDriverSettings(long driverId);

}
