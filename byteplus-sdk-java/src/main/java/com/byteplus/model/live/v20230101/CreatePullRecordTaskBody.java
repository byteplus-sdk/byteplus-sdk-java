package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreatePullRecordTaskBody
 */
@lombok.Data
public final class CreatePullRecordTaskBody  {

    /**
     * <p>域名空间名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>拉流/推流域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>应用名称，由 1 到 30 位数字、字母、下划线及"-"和"."组成。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>流名称，由 1 到 100 位数字、字母、下划线及"-"和"."组成。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>拉流地址。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StreamURL")
    private String streamURL;

    /**
     * <p>录制的开始时间，RFC3339 格式表示的 UTC 时间戳，精度为 s。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>录制的结束时间，RFC3339 格式表示的 UTC 时间戳，精度为 s。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
