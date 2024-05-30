package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateDenseSnapshotPresetRes
 */
@lombok.Data
public final class CreateDenseSnapshotPresetRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private CreateDenseSnapshotPresetResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private CreateDenseSnapshotPresetResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
