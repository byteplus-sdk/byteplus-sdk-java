package com.byteplus.model.live.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.byteplus.model.live.CallbackDetail;
import lombok.Data;

@Data
public class UpdateSnapshotPresetRequest {
    @JSONField(name = "Preset")
    String preset;
    @JSONField(name = "Vhost")
    String vhost;
    @JSONField(name = "App")
    String app;
    @JSONField(name = "Status")
    Long status;
    @JSONField(name = "Interval")
    Long interval;
    @JSONField(name = "Bucket")
    String bucket;
    @JSONField(name = "StorageDir")
    String storageDir;
    @JSONField(name = "AccessKey")
    String accessKey;
    @JSONField(name = "SnapshotFormat")
    String snapshotFormat;
    @JSONField(name = "SnapshotObject")
    String snapshotObject;
    @JSONField(name = "CallbackDetailList")
    CallbackDetail[] callbackDetailList;
    @JSONField(name = "ServiceID")
    String serviceID;
}
