package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeTimeShiftPresetDetailRes
 */
@lombok.Data
public final class DescribeTimeShiftPresetDetailRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeTimeShiftPresetDetailResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeTimeShiftPresetDetailResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
