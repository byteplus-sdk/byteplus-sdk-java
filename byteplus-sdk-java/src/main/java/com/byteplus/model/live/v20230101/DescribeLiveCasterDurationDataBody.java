package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveCasterDurationDataBody
 */
@lombok.Data
public final class DescribeLiveCasterDurationDataBody  {

    /**
     * <p>查询的起始时间，RFC3339 格式的 UTC 时间，精度为 s。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>查询的结束时间，RFC3339 格式的 UTC 时间，精度为 s。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>聚合的时间粒度，单位为 s，默认值为 300。支持如下时间粒度。</p>
     *
     *
     *
     * <p>- 60：支持单次查询时间跨度为 24 小时，历史查询时间范围为 366 天；</p>
     *
     * <p>- 300：支持单次查询时间跨度为 31 天，历史查询时间范围为 366 天；</p>
     *
     * <p>- 3600：支持单次查询时间跨度为 93 天，历史查询时间范围为 366 天；</p>
     *
     * <p>- 86400：支持单次查询时间跨度为 93 天，历史查询时间范围为 366 天。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aggregation")
    private Integer aggregation;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
