package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribeRecordTaskFileHistoryRes
 */
@lombok.Data
public final class DescribeRecordTaskFileHistoryRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeRecordTaskFileHistoryResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeRecordTaskFileHistoryResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
