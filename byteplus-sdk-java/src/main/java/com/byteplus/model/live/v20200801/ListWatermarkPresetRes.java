package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * ListWatermarkPresetRes
 */
@lombok.Data
public final class ListWatermarkPresetRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ListWatermarkPresetResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ListWatermarkPresetResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
