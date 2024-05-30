package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListSDKRes
 */
@lombok.Data
public final class ListSDKRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ListSDKResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ListSDKResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
