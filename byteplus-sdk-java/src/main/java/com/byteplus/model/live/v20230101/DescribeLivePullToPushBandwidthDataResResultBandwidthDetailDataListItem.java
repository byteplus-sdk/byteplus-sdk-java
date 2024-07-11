package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLivePullToPushBandwidthDataResResultBandwidthDetailDataListItem
 */
@lombok.Data
public final class DescribeLivePullToPushBandwidthDataResResultBandwidthDetailDataListItem  {

    /**
     * <p>按推流地址类型维度进行数据拆分时的地址类型信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DstAddrType")
    private String dstAddrType;

    /**
     * <p>按域名维度进行数据拆分时的域名信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>查询时间范围内的维度下的拉流转推峰值带宽，单位为 Mbps。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PeakUpBandwidth")
    private Float peakUpBandwidth;

    /**
     * <p>按维度进行数据拆分后，当前维度下所有时间粒度的数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BandwidthDataList")
    private List<DescribeLivePullToPushBandwidthDataResResultBandwidthDetailDataListItemBandwidthDataListItem> bandwidthDataList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
