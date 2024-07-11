package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateBillingRes
 */
@lombok.Data
public final class CreateBillingRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private CreateBillingResResponseMetadata responseMetadata;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
