package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * UpdateSDKRes
 */
@lombok.Data
public final class UpdateSDKRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private UpdateSDKResResponseMetadata responseMetadata;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
