package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveStreamSessionDataResResultSessionDataListItem
 */
@lombok.Data
public final class DescribeLiveStreamSessionDataResResultSessionDataListItem  {

    /**
     * <p>时间片起始时刻。RFC3339 时间，例如，`2022-04-13T00:00:00+08:00`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Timestamp")
    private String timestamp;

    /**
     * <p>请求数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Request")
    private Integer request;

    /**
     * <p>在线人数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OnlineUser")
    private Integer onlineUser;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
