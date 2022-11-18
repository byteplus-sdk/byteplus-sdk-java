package com.byteplus.model.live.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.byteplus.model.live.CallbackDetail;
import com.byteplus.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class ListVhostSnapshotPresetResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    ListVhostSnapshotPresetRespOutput result;

    @Data
    public static class ListVhostSnapshotPresetRespOutput {
        @JSONField(name = "PresetList")
        SlicePresetsVhostAPP[] PresetList;
    }

    @Data
    public static class SlicePresetsVhostAPP {

        @JSONField(name = "Vhost")
        String vhost;
        @JSONField(name = "App")
        String app;
        @JSONField(name = "SlicePreset")
        SlicePreset slicePreset;
    }

    @Data
    public static class SlicePreset {
        @JSONField(name = "Preset")
        String preset;
        @JSONField(name = "Description")
        String description;
        @JSONField(name = "AccountID")
        String accountID;
        @JSONField(name = "Bucket")
        String bucket;
        @JSONField(name = "Status")
        Long status;
        @JSONField(name = "AccessKey")
        String accessKey;
        @JSONField(name = "Interval")
        Long interval;
        @JSONField(name = "Format")
        String[] format;
        @JSONField(name = "Duration")
        Long duration;
        @JSONField(name = "SliceDuration")
        Long sliceDuration;
        @JSONField(name = "ReserveDays")
        Long reserveDays;
        @JSONField(name = "SnapshotFormat")
        String snapshotFormat;
        @JSONField(name = "SnapshotObject")
        String SnapshotObject;
        @JSONField(name = "CallbackDetail")
        CallbackDetail callbackDetail;
    }
}
