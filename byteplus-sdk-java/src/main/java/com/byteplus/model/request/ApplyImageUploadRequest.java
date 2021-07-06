package com.byteplus.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ApplyImageUploadRequest {
    @JSONField(name = "ServiceId")
    String serviceId;
    @JSONField(name = "SessionKey")
    String sessionKey;
    @JSONField(name = "UploadNum")
    Integer uploadNum;
    @JSONField(name = "StoreKeys")
    List<String> storeKeys;
    @JSONField(name = "-")
    CommitImageUploadRequest commitParam;
}
