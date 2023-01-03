package com.storyhasyou.odin.driver.pojo.vo.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

/**
 * @author fangxi created by 2023/1/3
 */
@Schema
@Data
public class UpdateDriverRequestVO {

    @NotNull(message = "id不能为空")
    @Schema(description = "id")
    private Long id;

    /**
     * 姓名
     */
    @Schema(description = "姓名")
    private String name;

    /**
     * 身份证号码
     */
    @Schema(description = "身份证号码")
    private String pid;

    /**
     * 电话
     */
    @Schema(description = "电话")
    private String tel;

    /**
     * 邮箱
     */
    @Schema(description = "邮箱")
    private String email;

    /**
     * 收信地址
     */
    @Schema(description = "收信地址")
    private String mailAddress;

    /**
     * 应急联系人
     */
    @Schema(description = "应急联系人")
    private String contactName;

    /**
     * 应急联系人电话
     */
    @Schema(description = "应急联系人电话")
    private String contactTel;

    /**
     * 1未认证，2已认证，3审核中
     */
    @Schema(description = "1未认证，2已认证，3审核中")
    private Integer realAuth;

    /**
     * 身份证地址
     */
    @Schema(description = "身份证地址")
    private String idcardAddress;

    /**
     * 身份证有效期
     */
    @Schema(description = "身份证有效期")
    private LocalDate idcardExpiration;

    /**
     * 身份证正面
     */
    @Schema(description = "身份证正面")
    private String idcardFront;

    /**
     * 身份证背面
     */
    @Schema(description = "身份证背面")
    private String idcardBack;

    /**
     * 手持身份证
     */
    @Schema(description = "手持身份证")
    private String idcardHolding;

    /**
     * 驾驶证类型
     */
    @Schema(description = "驾驶证类型")
    private String drcardType;

    /**
     * 驾驶证有效期
     */
    @Schema(description = "驾驶证有效期")
    private LocalDate drcardExpiration;

    /**
     * 驾驶证初次领证日期
     */
    @Schema(description = "驾驶证初次领证日期")
    private LocalDate drcardIssueDate;

    /**
     * 驾驶证正面
     */
    @Schema(description = "驾驶证正面")
    private String drcardFront;

    /**
     * 驾驶证背面
     */
    @Schema(description = "驾驶证背面")
    private String drcardBack;

    /**
     * 手持驾驶证
     */
    @Schema(description = "手持驾驶证")
    private String drcardHolding;

    /**
     * 家庭地址，包含地址和定位，用于回家导航
     */
    @Schema(description = "家庭地址，包含地址和定位，用于回家导航")
    private String home;

    /**
     * 摘要信息，level等级，totalOrder接单数，weekOrder周接单，weekComment周好评，appeal正在申诉量
     */
    @Schema(description = "摘要信息，level等级，totalOrder接单数，weekOrder周接单，weekComment周好评，appeal正在申诉量")
    private String summary;

    /**
     * 是否在腾讯云归档存放司机面部信息
     */
    @Schema(description = "是否在腾讯云归档存放司机面部信息")
    private Boolean archive;

}
