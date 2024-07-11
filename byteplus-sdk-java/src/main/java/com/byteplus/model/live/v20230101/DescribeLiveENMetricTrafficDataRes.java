package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveENMetricTrafficDataRes
 */
@lombok.Data
public final class DescribeLiveENMetricTrafficDataRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeLiveENMetricTrafficDataResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeLiveENMetricTrafficDataResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
