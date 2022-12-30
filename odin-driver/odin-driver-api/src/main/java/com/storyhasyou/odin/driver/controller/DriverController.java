package com.storyhasyou.odin.driver.controller;

import com.storyhasyou.kratos.result.Result;
import com.storyhasyou.odin.driver.pojo.vo.request.RegisterDriverRequestVO;
import com.storyhasyou.odin.driver.service.interfaces.DriverService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    private Result<Long> register(@RequestBody @Valid RegisterDriverRequestVO requestVO) {
        long driverId = driverService.register(requestVO);
        return Result.ok(driverId);
    }

}
