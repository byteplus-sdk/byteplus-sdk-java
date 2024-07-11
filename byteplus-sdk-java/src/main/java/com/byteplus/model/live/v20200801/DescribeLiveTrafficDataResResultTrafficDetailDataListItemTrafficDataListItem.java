package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveTrafficDataResResultTrafficDetailDataListItemTrafficDataListItem
 */
@lombok.Data
public final class DescribeLiveTrafficDataResResultTrafficDetailDataListItemTrafficDataListItem  {

    /**
     * <p>时间片起始时刻。RFC3339 格式的 UTC 时间，精度为 s，例如，`2022-04-13T00:00:00+08:00`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeStamp")
    private String timeStamp;

    /**
     * <p>下行带宽，单位为 Mbps</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DownTraffic")
    private Float downTraffic;

    /**
     * <p>上行带宽，单位为 Mbps</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UpTraffic")
    private Float upTraffic;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
