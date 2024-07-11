package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveENMetricBandwidthDataRes
 */
@lombok.Data
public final class DescribeLiveENMetricBandwidthDataRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeLiveENMetricBandwidthDataResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeLiveENMetricBandwidthDataResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
