package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ValidateCertBodyRsa
 */
@lombok.Data
public final class ValidateCertBodyRsa  {

    /**
     * <p>证书信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PubKey")
    private String pubKey;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
