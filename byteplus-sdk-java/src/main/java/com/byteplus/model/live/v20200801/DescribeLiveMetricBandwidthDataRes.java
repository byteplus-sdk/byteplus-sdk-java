package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveMetricBandwidthDataRes
 */
@lombok.Data
public final class DescribeLiveMetricBandwidthDataRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeLiveMetricBandwidthDataResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeLiveMetricBandwidthDataResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
