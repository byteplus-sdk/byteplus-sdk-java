package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * ApproveServiceRes
 */
@lombok.Data
public final class ApproveServiceRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ApproveServiceResResponseMetadata responseMetadata;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
