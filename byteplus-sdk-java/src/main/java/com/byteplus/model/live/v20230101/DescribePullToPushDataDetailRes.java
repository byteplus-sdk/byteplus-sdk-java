package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribePullToPushDataDetailRes
 */
@lombok.Data
public final class DescribePullToPushDataDetailRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribePullToPushDataDetailResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribePullToPushDataDetailResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
