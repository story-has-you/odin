package com.storyhasyou.odin.order.controller;

import com.storyhasyou.kratos.result.Result;
import com.storyhasyou.odin.order.pojo.vo.response.WorkTableResponseVO;
import com.storyhasyou.odin.order.service.interfaces.OrderService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fangxi created by 2023/1/5
 */
@Tag(name = "订单接口")
@RestController
@RequiredArgsConstructor
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;

    @GetMapping("/worktable/{driverId}")
    @Operation(summary = "工作台")
    public Result<WorkTableResponseVO> selectWorkTable(@PathVariable Long driverId) {
        WorkTableResponseVO workTableResponseVO = orderService.selectWorkTable(driverId);
        return Result.ok(workTableResponseVO);
    }

}
