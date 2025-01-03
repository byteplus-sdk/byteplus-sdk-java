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
     * <p>是否是hls abr 请求</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IsHlsAbr")
    private Boolean isHlsAbr;

    /**
     * <p>是否是dash abr 请求</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IsDashAbr")
    private Boolean isDashAbr;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
