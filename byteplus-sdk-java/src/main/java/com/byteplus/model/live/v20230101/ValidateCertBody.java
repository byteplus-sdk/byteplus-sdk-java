package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ValidateCertBody
 */
@lombok.Data
public final class ValidateCertBody  {

    /**
     * <p>域名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>证书信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Rsa")
    private ValidateCertBodyRsa rsa;

    /**
     * <p>证书链ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ChainID")
    private String chainID;

    /**
     * <p>账户id</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AccountID")
    private String accountID;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
