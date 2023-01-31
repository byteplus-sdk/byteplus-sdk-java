package com.byteplus.model.live.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GeneratePushURLRequest {
    @JSONField(name = "Vhost")
    String vhost;
    @JSONField(name = "App")
    String app;
    @JSONField(name = "Stream")
    String stream;
    @JSONField(name = "ValidDuration")
    int validDuration;
    @JSONField(name = "ExpiredTime")
    String expiredTime;
}
