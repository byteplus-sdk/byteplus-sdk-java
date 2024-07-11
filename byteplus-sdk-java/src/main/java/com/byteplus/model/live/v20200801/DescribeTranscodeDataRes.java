package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribeTranscodeDataRes
 */
@lombok.Data
public final class DescribeTranscodeDataRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeTranscodeDataResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeTranscodeDataResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
