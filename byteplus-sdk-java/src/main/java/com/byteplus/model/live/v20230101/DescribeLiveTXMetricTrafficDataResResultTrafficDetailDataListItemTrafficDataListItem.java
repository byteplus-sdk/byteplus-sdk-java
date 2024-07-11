package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveTXMetricTrafficDataResResultTrafficDetailDataListItemTrafficDataListItem
 */
@lombok.Data
public final class DescribeLiveTXMetricTrafficDataResResultTrafficDetailDataListItemTrafficDataListItem  {

    /**
     * <p>流量，单位byte。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Flux")
    private Float flux;

    /**
     * <p>时间片起始时刻。格式YYYY-MM-DD HH:MM:SS，北京时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Time")
    private String time;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
