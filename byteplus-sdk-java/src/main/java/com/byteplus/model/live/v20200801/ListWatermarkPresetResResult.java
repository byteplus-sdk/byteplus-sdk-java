package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * ListWatermarkPresetResResult
 */
@lombok.Data
public final class ListWatermarkPresetResResult  {

    /**
     * <p>水印模板</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Preset")
    private ListWatermarkPresetResResultPreset preset;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
