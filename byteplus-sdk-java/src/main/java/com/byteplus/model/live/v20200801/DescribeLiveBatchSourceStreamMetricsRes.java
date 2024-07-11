package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveBatchSourceStreamMetricsRes
 */
@lombok.Data
public final class DescribeLiveBatchSourceStreamMetricsRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeLiveBatchSourceStreamMetricsResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeLiveBatchSourceStreamMetricsResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
