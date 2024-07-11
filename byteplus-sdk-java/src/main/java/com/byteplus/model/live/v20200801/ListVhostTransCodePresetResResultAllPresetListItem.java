package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * ListVhostTransCodePresetResResultAllPresetListItem
 */
@lombok.Data
public final class ListVhostTransCodePresetResResultAllPresetListItem  {

    /**
     * <p>应用名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>转码配置具体信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TranscodePreset")
    private ListVhostTransCodePresetResResultAllPresetListItemTranscodePreset transcodePreset;

    /**
     * <p>域名空间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
