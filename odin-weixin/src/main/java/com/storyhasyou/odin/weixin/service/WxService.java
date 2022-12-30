package com.storyhasyou.odin.weixin.service;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.bean.WxMaJscode2SessionResult;
import com.storyhasyou.kratos.exceptions.BusinessException;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import me.chanjar.weixin.common.error.WxErrorException;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

/**
 * @author fangxi created by 2022/12/29
 */
@Service
@RequiredArgsConstructor
public class WxService {

    private final WxMaService wxMaService;

    @SneakyThrows(WxErrorException.class)
    public String getAccessToken() {
        return wxMaService.getAccessToken();
    }

    public String getOpenId(String jsCode) {
        try {
            WxMaJscode2SessionResult wxMaJscode2SessionResult = wxMaService.jsCode2SessionInfo(jsCode);
            Assert.notNull(wxMaJscode2SessionResult, "获取openId失败");
            return wxMaJscode2SessionResult.getOpenid();
        } catch (WxErrorException e) {
            throw new BusinessException(e.getMessage());
        }
    }

}
