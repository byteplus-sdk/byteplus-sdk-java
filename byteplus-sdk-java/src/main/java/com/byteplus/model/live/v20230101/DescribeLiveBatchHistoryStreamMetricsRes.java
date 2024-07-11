package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveBatchHistoryStreamMetricsRes
 */
@lombok.Data
public final class DescribeLiveBatchHistoryStreamMetricsRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeLiveBatchHistoryStreamMetricsResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeLiveBatchHistoryStreamMetricsResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
