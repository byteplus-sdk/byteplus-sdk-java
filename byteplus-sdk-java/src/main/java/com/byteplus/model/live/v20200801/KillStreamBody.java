package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * KillStreamBody
 */
@lombok.Data
public final class KillStreamBody  {

    /**
     * <p>域名空间名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>推流域名。</p>
     *
     * <p>参数 `Domain` 和 `Vhost`传且仅传一个。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>应用名称，由 1 到 30 位数字、字母、下划线及"-"和"."组成</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>流名称，由 1 到 100 位数字、字母、下划线及"-"和"."组成</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>禁推的结束时间，禁推有效期最长为 90 天，默认为当前时间加 90 天</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
