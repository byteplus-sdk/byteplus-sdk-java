package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveP95PeakBandwidthDataResResultRegionListItem
 */
@lombok.Data
public final class DescribeLiveP95PeakBandwidthDataResResultRegionListItem  {

    /**
     * <p>区域信息中的大区标识符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Area")
    private String area;

    /**
     * <p>区域信息中的国家标识符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Country")
    private String country;

    /**
     * <p>区域信息中的省份标识符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Province")
    private String province;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
