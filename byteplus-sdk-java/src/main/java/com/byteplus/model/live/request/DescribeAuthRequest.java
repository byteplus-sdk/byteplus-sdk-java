package com.byteplus.model.live.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class DescribeAuthRequest {

    @JSONField(name = "Vhost")
    String vhost;
    @JSONField(name = "Domain")
    String domain;
    @JSONField(name = "App")
    String app;
    @JSONField(name = "SceneType")
    String sceneType;
}
