package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribePullToPushBandwidthDataResResult
 */
@lombok.Data
public final class DescribePullToPushBandwidthDataResResult  {

    /**
     * <p>域名列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

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
     * <p>时间粒度</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aggregation")
    private Integer aggregation;

    /**
     * <p>推流地址类型。</p>
     *
     * <p>- Live：非第三方；</p>
     *
     * <p>- Third：第三方。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DstAddrTypeList")
    private List<String> dstAddrTypeList;

    /**
     * <p>是否展示过滤字段和时间聚合后的详细数据，默认值为 false。</p>
     *
     * <p>- false：不展示；</p>
     *
     * <p>- true：展示。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ShowDetail")
    private Boolean showDetail;

    /**
     * <p>转推带宽峰值，单位为 Mbps</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PeakUpBandwidth")
    private Float peakUpBandwidth;

    /**
     * <p>所有时间粒度数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BandwidthDataList")
    private List<DescribePullToPushBandwidthDataResResultBandwidthDataListItem> bandwidthDataList;

    /**
     * <p>过滤字段和时间聚合后的数据</p>
     *
     * <p>:::tip</p>
     *
     * <p>请求时，`DomainList` 和 `DstAddrTypeList` 至少有一个参数传入了多个值时，会返回该参数；否则不返回该参数。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BandwidthDetailDataList")
    private List<DescribePullToPushBandwidthDataResResultBandwidthDetailDataListItem> bandwidthDetailDataList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
