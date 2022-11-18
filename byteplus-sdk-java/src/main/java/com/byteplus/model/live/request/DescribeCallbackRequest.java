package com.byteplus.model.live.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class DescribeCallbackRequest {

    @JSONField(name = "Vhost")
    String vhost;
    @JSONField(name = "Domain")
    String domain;
    @JSONField(name = "App")
    String app;
    @JSONField(name = "MessageType")
    String messageType;
}
