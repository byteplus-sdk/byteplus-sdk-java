package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * ListVhostSnapshotPresetRes
 */
@lombok.Data
public final class ListVhostSnapshotPresetRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ListVhostSnapshotPresetResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ListVhostSnapshotPresetResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
