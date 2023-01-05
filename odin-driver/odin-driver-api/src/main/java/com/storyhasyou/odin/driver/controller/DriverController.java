package com.storyhasyou.odin.driver.controller;

import com.storyhasyou.kratos.result.Result;
import com.storyhasyou.odin.driver.pojo.model.CurrentDriver;
import com.storyhasyou.odin.driver.pojo.vo.request.RegisterDriverRequestVO;
import com.storyhasyou.odin.driver.pojo.vo.request.UpdateDriverRequestVO;
import com.storyhasyou.odin.driver.pojo.vo.response.DriverResponseVO;
import com.storyhasyou.odin.driver.pojo.vo.response.DriverSettingsResponseVO;
import com.storyhasyou.odin.driver.service.interfaces.DriverService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author fangxi created by 2022/12/30
 */
@Tag(name = "司机接口")
@RestController
@RequiredArgsConstructor
@RequestMapping("/driver")
public class DriverController {

    private final DriverService driverService;

    @PostMapping("/register")
    @Operation(summary = "注册司机")
    private Result<String> register(@RequestBody @Valid RegisterDriverRequestVO requestVO) {
        String token = driverService.register(requestVO);
        return Result.ok(token);
    }

    @PostMapping("/uploadDriverPhoto")
    @Operation(summary = "上传司机照片")
    public Result<String> uploadDriverPhoto(MultipartFile file) throws Exception {
        String url = driverService.uploadDriverPhoto(file.getBytes());
        return Result.ok(url);
    }

    @PostMapping("/updateDriverInfo")
    @Operation(summary = "更新司机信息")
    public Result<Boolean> updateDriverInfo(@RequestBody @Valid UpdateDriverRequestVO requestVO) {
        boolean result = driverService.updateDriverInfo(requestVO);
        return Result.ok(result);
    }

    @PostMapping("/login")
    @Operation(summary = "司机登录")
    public Result<CurrentDriver> login(@RequestBody String openId) {
        CurrentDriver currentDriver = driverService.login(openId);
        return Result.ok(currentDriver);
    }

    @GetMapping("/{driverId}")
    @Operation(summary = "获取司机信息")
    public Result<DriverResponseVO> selectDriver(@PathVariable Long driverId) {
        DriverResponseVO driver = driverService.selectById(driverId);
        return Result.ok(driver);
    }

    @GetMapping("/settings/{driverId}")
    @Operation(summary = "获取司机配置信息")
    public Result<DriverSettingsResponseVO> selectDriverSettings(@PathVariable Long driverId) {
        DriverSettingsResponseVO driverSettings = driverService.selectDriverSettings(driverId);
        return Result.ok(driverSettings);
    }
}
