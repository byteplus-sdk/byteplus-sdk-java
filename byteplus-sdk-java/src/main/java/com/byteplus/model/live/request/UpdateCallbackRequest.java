package com.byteplus.model.live.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.byteplus.model.live.CallbackDetail;
import lombok.Data;

import java.util.Map;

@Data
public class UpdateCallbackRequest {

    @JSONField(name = "MessageType")
    String messageType;
    @JSONField(name = "Vhost")
    String vhost;
    @JSONField(name = "Domain")
    String domain;
    @JSONField(name = "App")
    String app;
    @JSONField(name = "TranscodeCallback")
    Long transcodeCallback;
    @JSONField(name = "CallbackField")
    String[] callbackField;
    @JSONField(name = "AuthField")
    Map<String, String> authField;
    @JSONField(name = "EncryptField")
    String[] encryptField;
    @JSONField(name = "TimeoutSecond")
    Long timeoutSecond;
    @JSONField(name = "RetryTimes")
    Long retryTimes;
    @JSONField(name = "RetryInternalSecond")
    Long retryInternalSecond;
    @JSONField(name = "CallbackDetailList")
    CallbackDetail[] callbackDetailList;

}
