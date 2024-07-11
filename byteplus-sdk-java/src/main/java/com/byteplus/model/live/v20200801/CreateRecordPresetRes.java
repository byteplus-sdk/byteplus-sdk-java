package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * CreateRecordPresetRes
 */
@lombok.Data
public final class CreateRecordPresetRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private CreateRecordPresetResResponseMetadata responseMetadata;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
