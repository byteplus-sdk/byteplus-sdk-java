package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * CreateSDKRes
 */
@lombok.Data
public final class CreateSDKRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private CreateSDKResResponseMetadata responseMetadata;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
