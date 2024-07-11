package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DisableDomainRes
 */
@lombok.Data
public final class DisableDomainRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DisableDomainResResponseMetadata responseMetadata;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
