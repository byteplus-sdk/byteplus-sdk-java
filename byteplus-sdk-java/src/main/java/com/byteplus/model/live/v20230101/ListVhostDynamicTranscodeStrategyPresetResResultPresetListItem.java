package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListVhostDynamicTranscodeStrategyPresetResResultPresetListItem
 */
@lombok.Data
public final class ListVhostDynamicTranscodeStrategyPresetResResultPresetListItem  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TranscodePreset")
    private ListVhostDynamicTranscodeStrategyPresetResResultPresetListItemTranscodePreset transcodePreset;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
