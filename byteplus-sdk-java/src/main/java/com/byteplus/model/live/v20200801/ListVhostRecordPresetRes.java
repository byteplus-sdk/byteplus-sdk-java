package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * ListVhostRecordPresetRes
 */
@lombok.Data
public final class ListVhostRecordPresetRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ListVhostRecordPresetResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ListVhostRecordPresetResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
