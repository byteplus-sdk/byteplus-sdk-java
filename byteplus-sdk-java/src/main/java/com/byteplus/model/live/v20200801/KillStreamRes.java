package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * KillStreamRes
 */
@lombok.Data
public final class KillStreamRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private KillStreamResResponseMetadata responseMetadata;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
