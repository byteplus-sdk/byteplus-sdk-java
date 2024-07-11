package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveAuditDataRes
 */
@lombok.Data
public final class DescribeLiveAuditDataRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeLiveAuditDataResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeLiveAuditDataResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
