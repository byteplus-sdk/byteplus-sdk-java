package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveBatchSourceStreamAvgMetricsResResultStreamMetricListItem
 */
@lombok.Data
public final class DescribeLiveBatchSourceStreamAvgMetricsResResultStreamMetricListItem  {

    /**
     * <p>拉流域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>应用名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>流名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>按指定时间粒度聚合的监控数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MetricList")
    private List<DescribeLiveBatchSourceStreamAvgMetricsResResultStreamMetricListItemMetricListItem> metricList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
