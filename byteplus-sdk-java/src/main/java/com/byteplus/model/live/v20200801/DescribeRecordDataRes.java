package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribeRecordDataRes
 */
@lombok.Data
public final class DescribeRecordDataRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeRecordDataResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeRecordDataResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
