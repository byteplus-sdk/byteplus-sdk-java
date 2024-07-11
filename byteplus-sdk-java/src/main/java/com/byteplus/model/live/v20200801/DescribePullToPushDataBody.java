package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribePullToPushDataBody
 */
@lombok.Data
public final class DescribePullToPushDataBody  {

    /**
     * <p>聚合时间粒度。默认值为 60，单位为 s，支持的取值如下所示。</p>
     *
     * <p>* 60：支持单次查询时间跨度为 24 小时，数据保存时长为 7 天；</p>
     *
     * <p>* 3600：支持单次查询时间跨度为 93 天，数据保存时长为 93 天；</p>
     *
     * <p>* 2678400：支持单次查询时间跨度为 366 天，数据保存时长为 366 天。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aggregation")
    private Integer aggregation;

    /**
     * <p>查询的结束时间，RFC3339 格式的 UTC 时间，精度为 s，</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>查询的起始时间，RFC3339 格式的 UTC 时间，精度为 s，</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
