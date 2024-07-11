package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeSnapshotDataBody
 */
@lombok.Data
public final class DescribeSnapshotDataBody  {

    /**
     * <p>数据聚合的时间粒度，单位为 s，支持按天粒度聚合，默认为 86400</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aggregation")
    private Integer aggregation;

    /**
     * <p>域名列表，缺省情况表示该用户的所有域名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

    /**
     * <p>查询的结束时间，RFC3339 格式的 UTC 时间，精度为 s；例如：2022-04-02T00:00:00+08:00</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Resolution")
    private String resolution;

    /**
     * <p>查询的起始时间，RFC3339 格式的 UTC 时间，精度为 s；例如：2022-04-01T00:00:00+08:00</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VCodec")
    private String vCodec;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
