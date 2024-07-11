package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeCDNTrafficDataResResultTrafficDetailDataListItem
 */
@lombok.Data
public final class DescribeCDNTrafficDataResResultTrafficDetailDataListItem  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TrafficDataList")
    private List<DescribeCDNTrafficDataResResultTrafficDetailDataListItemTrafficDataListItem> trafficDataList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
