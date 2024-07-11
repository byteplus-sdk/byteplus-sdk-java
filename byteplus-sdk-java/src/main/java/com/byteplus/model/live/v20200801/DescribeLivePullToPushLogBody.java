package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLivePullToPushLogBody
 */
@lombok.Data
public final class DescribeLivePullToPushLogBody  {

    /**
     * <p>开始时间，默认为 24h 前，支持配置最近 30 天内的任意时间点，RFC3339 格式的 UTC 时间，精度为 s，例如，`2021-12-31T14:00:00+08:00`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>结束时间，默认为当前时间。RFC3339 格式的 UTC 时间，精度为 s，例如，`2021-12-31T14:00:00+08:00`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>每页数量，默认值为 20</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Size")
    private Integer size;

    /**
     * <p>页码，默认值为 1，取值范围为正整数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Page")
    private Integer page;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
