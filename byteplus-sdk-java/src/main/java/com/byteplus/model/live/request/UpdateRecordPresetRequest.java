package com.byteplus.model.live.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.byteplus.model.live.CallbackDetail;
import com.byteplus.model.live.RecordTob;
import lombok.Data;

@Data
public class UpdateRecordPresetRequest {

    @JSONField(name = "Preset")
    String preset;
    @JSONField(name = "Vhost")
    String vhost;
    @JSONField(name = "App")
    String app;
    @JSONField(name = "Status")
    Long status;
    @JSONField(name = "Format")
    String[] format;
    @JSONField(name = "Duration")
    Long duration;
    @JSONField(name = "SliceDuration")
    Long sliceDuration;
    @JSONField(name = "ReserveDuration")
    Long reserveDuration;
    @JSONField(name = "Bucket")
    String bucket;
    @JSONField(name = "StorageDir")
    String storageDir;
    @JSONField(name = "AccessKey")
    String accessKey;
    @JSONField(name = "RecordTob")
    RecordTob[] recordTob;
    @JSONField(name = "CallbackDetailList")
    CallbackDetail[] callbackDetailList;
    @JSONField(name = "PullDomain")
    String pullDomain;
    @JSONField(name = "VodNamespace")
    String vodNamespace;
    @JSONField(name = "WorkflowID")
    String workflowID;
    @JSONField(name = "ACL")
    String ACL;
}
