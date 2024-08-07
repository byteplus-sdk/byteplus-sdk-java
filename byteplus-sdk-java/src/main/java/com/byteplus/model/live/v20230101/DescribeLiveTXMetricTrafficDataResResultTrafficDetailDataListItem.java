package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveTXMetricTrafficDataResResultTrafficDetailDataListItem
 */
@lombok.Data
public final class DescribeLiveTXMetricTrafficDataResResultTrafficDetailDataListItem  {

    /**
     * <p>域名信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>按维度进行数据拆分后，当前维度下所有时间粒度的数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TrafficDataList")
    private List<DescribeLiveTXMetricTrafficDataResResultTrafficDetailDataListItemTrafficDataListItem> trafficDataList;

    /**
     * <p>地域信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Area")
    private String area;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
