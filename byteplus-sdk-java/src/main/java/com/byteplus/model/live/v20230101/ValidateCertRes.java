package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ValidateCertRes
 */
@lombok.Data
public final class ValidateCertRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ValidateCertResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ValidateCertResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
