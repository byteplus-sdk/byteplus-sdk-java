package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribePushStreamMetricsBody
 */
@lombok.Data
public final class DescribePushStreamMetricsBody  {

    /**
     * <p>聚合的时间粒度，单位为 s。支持的取值为 5 和 30，默认值为 30</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aggregation")
    private Integer aggregation;

    /**
     * <p>应用名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>推流域名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "End")
    private String end;

    /**
     * <p>查询的结束时间。结束时间需晚于 `StartTime`，且与 `StartTime` 间隔不超过 24h，RFC3339 格式的 UTC 时间，精度为 s，例如：2022-04-02T00:00:00+08:00 。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Start")
    private String start;

    /**
     * <p>查询的起始时间。支持最近 31d 内的任意时间点，RFC3339 格式的 UTC 时间，精度为 s，例如：2022-04-01T00:00:00+08:00</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>流名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
