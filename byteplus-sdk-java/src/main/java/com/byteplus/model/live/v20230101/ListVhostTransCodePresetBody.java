package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListVhostTransCodePresetBody
 */
@lombok.Data
public final class ListVhostTransCodePresetBody  {

    /**
     * <p>域名空间，即直播流地址的域名所属的域名空间。您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console.volcengine.com/live/main/domain/list)页面，查看需要录制的直播流使用的域名所属的域名空间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>是否查询基于 HLS 协议的 ABR 子流转码配置，默认为空。</p>
     *
     * <p>- `true`: 是</p>
     *
     * <p>- `false`: 否</p>
     *
     * <p>:::tip</p>
     *
     * <p>`IsHlsAbr` 和 `IsDashAbr` 均为 `true` 时，表示查询同时基于 HLS 协议和 DASH 协议的 ABR 子流转码配置。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IsHlsAbr")
    private Boolean isHlsAbr;

    /**
     * <p>是否查询基于 DASH 协议的 ABR 子流转码配置，默认为空。</p>
     *
     * <p>- `true`: 是</p>
     *
     * <p>- `false`: 否</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>`IsHlsAbr` 和 `IsDashAbr` 均为 `true` 时，表示查询同时基于 HLS 协议和 DASH 协议的 ABR 子流转码配置。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IsDashAbr")
    private Boolean isDashAbr;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
