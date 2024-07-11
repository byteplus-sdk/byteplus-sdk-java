package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveASRDurationDataRes
 */
@lombok.Data
public final class DescribeLiveASRDurationDataRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeLiveASRDurationDataResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeLiveASRDurationDataResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
