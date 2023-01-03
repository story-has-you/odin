package com.storyhasyou.odin.driver.controller;

import com.storyhasyou.kratos.result.Result;
import com.storyhasyou.odin.driver.pojo.vo.request.RegisterDriverRequestVO;
import com.storyhasyou.odin.driver.pojo.vo.request.UpdateDriverRequestVO;
import com.storyhasyou.odin.driver.service.interfaces.DriverService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author fangxi created by 2022/12/30
 */
@Tag(name = "司机服务")
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
}
