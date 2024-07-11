package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribePullToPushBandwidthDataRes
 */
@lombok.Data
public final class DescribePullToPushBandwidthDataRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribePullToPushBandwidthDataResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribePullToPushBandwidthDataResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
