package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * UpdateCertBodyRsa
 */
@lombok.Data
public final class UpdateCertBodyRsa  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "prikey")
    private String prikey;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "pubkey")
    private String pubkey;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
