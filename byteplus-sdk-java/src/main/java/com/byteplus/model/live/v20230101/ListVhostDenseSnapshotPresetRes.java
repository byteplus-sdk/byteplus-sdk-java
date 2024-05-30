package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListVhostDenseSnapshotPresetRes
 */
@lombok.Data
public final class ListVhostDenseSnapshotPresetRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ListVhostDenseSnapshotPresetResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ListVhostDenseSnapshotPresetResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
