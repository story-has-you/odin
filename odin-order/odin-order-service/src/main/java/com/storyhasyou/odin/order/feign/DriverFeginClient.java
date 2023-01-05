package com.storyhasyou.odin.order.feign;

import com.storyhasyou.kratos.result.Result;
import com.storyhasyou.odin.order.pojo.dto.DriverSettingsDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author fangxi created by 2023/1/5
 */
@FeignClient(name = "odin-driver")
public interface DriverFeginClient {

    @GetMapping("/driver/settings/{driverId}")
    Result<DriverSettingsDTO> selectDriverSettings(@PathVariable Long driverId);

}
