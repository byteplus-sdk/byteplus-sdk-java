package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeNSSRewriteConfigRes
 */
@lombok.Data
public final class DescribeNSSRewriteConfigRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeNSSRewriteConfigResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeNSSRewriteConfigResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
