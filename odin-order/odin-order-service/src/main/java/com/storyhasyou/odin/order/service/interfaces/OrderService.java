package com.storyhasyou.odin.order.service.interfaces;

import com.storyhasyou.odin.order.pojo.vo.response.WorkTableResponseVO;

/**
 * @author fangxi created by 2023/1/5
 */
public interface OrderService {

    WorkTableResponseVO selectWorkTable(long driverId);

}
