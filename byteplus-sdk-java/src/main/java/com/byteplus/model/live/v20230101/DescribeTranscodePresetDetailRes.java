package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeTranscodePresetDetailRes
 */
@lombok.Data
public final class DescribeTranscodePresetDetailRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeTranscodePresetDetailResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeTranscodePresetDetailResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
