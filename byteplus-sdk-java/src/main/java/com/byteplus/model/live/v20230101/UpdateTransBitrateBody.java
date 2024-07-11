package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateTransBitrateBody
 */
@lombok.Data
public final class UpdateTransBitrateBody  {

    /**
     * <p>域名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>应用名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>转码流名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StreamTranscoded")
    private String streamTranscoded;

    /**
     * <p>更新的码率，单位为kb</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Bitrate")
    private Integer bitrate;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
