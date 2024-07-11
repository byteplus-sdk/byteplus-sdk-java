package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveBatchSourceStreamMetricsResResult
 */
@lombok.Data
public final class DescribeLiveBatchSourceStreamMetricsResResult  {

    /**
     * <p>拉流域名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>应用名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>流名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>查询的起始时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>查询的结束时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>聚合的时间粒度</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aggregation")
    private Integer aggregation;

    /**
     * <p>按指定时间粒度聚合的监控数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StreamMetricList")
    private List<DescribeLiveBatchSourceStreamMetricsResResultStreamMetricListItem> streamMetricList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
