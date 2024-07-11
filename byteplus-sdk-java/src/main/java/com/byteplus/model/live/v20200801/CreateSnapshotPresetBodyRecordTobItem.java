package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * CreateSnapshotPresetBodyRecordTobItem
 */
@lombok.Data
public final class CreateSnapshotPresetBodyRecordTobItem  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Duration")
    private Integer duration;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Format")
    private String format;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RecordObject")
    private String recordObject;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Splice")
    private Integer splice;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
