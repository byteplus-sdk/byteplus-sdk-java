package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveStreamInfoByPageRes
 */
@lombok.Data
public final class DescribeLiveStreamInfoByPageRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeLiveStreamInfoByPageResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeLiveStreamInfoByPageResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
