package com.byteplus.model.live.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class UpdateAuthKeyRequest {

    @JSONField(name = "Vhost")
    String vhost;
    @JSONField(name = "Domain")
    String domain;
    @JSONField(name = "App")
    String app;
    @JSONField(name = "SceneType")
    String sceneType;
    @JSONField(name = "AuthDetailList")
    Object[] authDetailList;
    @JSONField(name = "ValidDuration")
    Long validDuration;
    @JSONField(name = "PushPullEnable")
    Boolean pushPullEnable;
}
