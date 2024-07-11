package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveTimeShiftDataBody
 */
@lombok.Data
public final class DescribeLiveTimeShiftDataBody  {

    /**
     * <p>域名空间列表，缺省情况表示查询该用户的所有域名空间。</p>
     *
     * <p>例如，["www.example.com","www.example2.com"]</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhosts")
    private List<String> vhosts;

    /**
     * <p>开始时间，RFC3339 格式的 UTC 时间，精度为 s，例如：2022-04-01T00:00:00+08:00</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>结束时间，RFC3339 格式的 UTC 时间，精度为 s，例如：2022-04-01T00:00:00+08:00</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>聚合时间粒度，单位秒，支持配置为 86400，支持查询最近 90 天内的数据，单次查询时间范围 90 天</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aggregation")
    private Integer aggregation;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
