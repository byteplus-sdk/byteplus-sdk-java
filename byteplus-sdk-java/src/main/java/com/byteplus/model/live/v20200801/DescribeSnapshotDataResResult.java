package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeSnapshotDataResResult
 */
@lombok.Data
public final class DescribeSnapshotDataResResult  {

    /**
     * <p>域名列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

    /**
     * <p>每个聚合时间片的截图张数详情</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "List")
    private List<DescribeSnapshotDataResResultListItem> list;

    /**
     * <p>所选域名的截图总张数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Count")
    private Integer count;

    /**
     * <p>时间粒度，单位为 s</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aggregation")
    private Integer aggregation;

    /**
     * <p>查询的结束时间，RFC3339 格式的 UTC 时间，精度为 s</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>查询的起始时间，RFC3339 格式的 UTC 时间，精度为 s</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
