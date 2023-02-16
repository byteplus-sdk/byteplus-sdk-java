package com.byteplus.model.live.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.byteplus.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class DescribeAuthResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    DescribeAuthOutput Result;

    @Data
    public static class DescribeAuthOutput{
        @JSONField(name = "AuthList")
        AuthInfoItem[] authList;
    }

    @Data
    public static class AuthInfoItem{
        @JSONField(name = "Vhost")
        String vhost;
        @JSONField(name = "App")
        String app;
        @JSONField(name = "SceneType")
        String sceneType;
        @JSONField(name = "Domain")
        String domain;
        @JSONField(name = "ValidDuration")
        Long validDuration;
        @JSONField(name = "AuthStatus")
        Integer authStatus;
        @JSONField(name = "AuthDetailList")
        Object authDetailList;
    }
}
