package com.storyhasyou.odin.driver.pojo.vo.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * @author fangxi created by 2022/12/30
 */
@Data
public class RegisterDriverRequestVO {

    @NotBlank(message = "code 不能为空")
    @Schema(description = "code")
    private String jsCode;
    @NotBlank(message = "昵称不能为空")
    @Schema(description = "昵称")
    private String nickname;
    @NotBlank(message = "头像不能为空")
    @Schema(description = "头像")
    private String photo;

}
