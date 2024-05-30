package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * VerifyDomainOwnerRes
 */
@lombok.Data
public final class VerifyDomainOwnerRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private VerifyDomainOwnerResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private VerifyDomainOwnerResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
