package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * KillStreamBody
 */
@lombok.Data
public final class KillStreamBody  {

    /**
     * <p>域名空间，您可以调用 [DescribeLiveStreamInfoByPage](https://www.volcengine.com/docs/6469/1126841) 接口，查看待断开的在线流的信息，包括 `Vhost`、`APP` 和 `Stream`。</p>
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
     * <p>直播流使用的应用名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>直播流使用的流名称。</p>
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
