package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveTXMetricTrafficDataRes
 */
@lombok.Data
public final class DescribeLiveTXMetricTrafficDataRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeLiveTXMetricTrafficDataResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeLiveTXMetricTrafficDataResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
