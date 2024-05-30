package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * RejectDomainRes
 */
@lombok.Data
public final class RejectDomainRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private RejectDomainResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private RejectDomainResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
