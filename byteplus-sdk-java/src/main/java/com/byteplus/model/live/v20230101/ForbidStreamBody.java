package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ForbidStreamBody
 */
@lombok.Data
public final class ForbidStreamBody  {

    /**
     * <p>域名空间，即直播流地址的域名（`Domain`）所属的域名空间（`Vhost`）。您可以调用 [`ListDomainDetail`](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console.volcengine.com/live/main/domain/list)页面，查看待禁推的直播流使用的域名所属的域名空间。</p>
     *
     * <p>:::tip</p>
     *
     * <p>参数 `Domain` 和 `Vhost` 传且仅传一个。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>直播流使用的域名，您可以调用 [`ListDomainDetail`](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console.volcengine.com/live/main/domain/list)页面，查看待禁推的直播流使用的域名。</p>
     *
     * <p>:::tip</p>
     *
     * <p>参数 `Domain` 和 `Vhost` 传且仅传一个。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>应用名称，取值与直播流地址的 AppName 字段取值相同。支持由大小写字母（A - Z、a - z）、下划线（_）、短横线（-）和句点（.）组成，长度为 1 到 30 个字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>流名称，取值与直播流地址的 StreamName 字段取值相同。支持由大小写字母（A - Z、a - z）、下划线（_）、短横线（-）和句点（.）组成，长度为 1 到 100 个字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>禁推的结束时间，RFC3339 格式的 UTC 时间，精度为毫秒，禁推有效期最长为 90 天，默认为当前时间加 90 天。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
