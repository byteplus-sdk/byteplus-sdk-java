package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DeleteDomainRes
 */
@lombok.Data
public final class DeleteDomainRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DeleteDomainResResponseMetadata responseMetadata;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
