package com.storyhasyou.odin.oss.service;

import cn.hutool.core.util.IdUtil;
import com.aliyun.oss.OSS;
import com.aliyun.oss.common.comm.ResponseMessage;
import com.aliyun.oss.model.PutObjectRequest;
import com.aliyun.oss.model.PutObjectResult;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.io.ByteArrayInputStream;

/**
 * @author fangxi created by 2022/12/30
 */
@Service
@RequiredArgsConstructor
public class OssService {

    private final OSS ossClient;

    public String upload(byte[] content) {
        String fileName = IdUtil.simpleUUID() + ".jpg";
        PutObjectRequest putObjectRequest = new PutObjectRequest("nj-zc-app", fileName, new ByteArrayInputStream(content));
        // 设置该属性可以返回response。如果不设置，则返回的response为空。
        putObjectRequest.setProcess("true");
        PutObjectResult result = ossClient.putObject(putObjectRequest);
        Assert.notNull(result, "上传失败");
        ResponseMessage response = result.getResponse();
        return response.getUri();
    }

}
