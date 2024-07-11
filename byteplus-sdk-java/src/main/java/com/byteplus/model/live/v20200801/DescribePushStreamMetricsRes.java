package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribePushStreamMetricsRes
 */
@lombok.Data
public final class DescribePushStreamMetricsRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribePushStreamMetricsResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribePushStreamMetricsResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
