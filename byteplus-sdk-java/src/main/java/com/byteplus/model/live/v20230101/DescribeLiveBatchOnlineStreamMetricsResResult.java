package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveBatchOnlineStreamMetricsResResult
 */
@lombok.Data
public final class DescribeLiveBatchOnlineStreamMetricsResResult  {

    /**
     * <p>查询的应用名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>查询的流名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>查询到的在线流信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StreamMetricList")
    private List<DescribeLiveBatchOnlineStreamMetricsResResultStreamMetricListItem> streamMetricList;

    /**
     * <p>查询的域名列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

    /**
     * <p>查询的在线流类型，取值及含义如下所示。</p>
     *
     * <p>- `all`：所有流；</p>
     *
     * <p>- `push`：推流；</p>
     *
     * <p>- `relay`：回源流；</p>
     *
     * <p>- `transcode`：转码流。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StreamType")
    private String streamType;

    /**
     * <p>查询结果的分页信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Pagination")
    private DescribeLiveBatchOnlineStreamMetricsResResultPagination pagination;

    /**
     * <p>查询的域名空间列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VhostList")
    private List<String> vhostList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
