package com.storyhasyou.odin.user.interfaces;

import jakarta.servlet.http.HttpServletResponse;

/**
 * @author fangxi created by 2022/12/19
 */
public interface LoginService {

    void getCaptcha(HttpServletResponse response);

}
