package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * StopPullToPushTaskRes
 */
@lombok.Data
public final class StopPullToPushTaskRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private StopPullToPushTaskResResponseMetadata responseMetadata;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
