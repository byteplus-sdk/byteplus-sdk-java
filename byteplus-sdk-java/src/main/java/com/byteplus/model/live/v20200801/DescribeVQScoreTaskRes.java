package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribeVQScoreTaskRes
 */
@lombok.Data
public final class DescribeVQScoreTaskRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeVQScoreTaskResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeVQScoreTaskResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
