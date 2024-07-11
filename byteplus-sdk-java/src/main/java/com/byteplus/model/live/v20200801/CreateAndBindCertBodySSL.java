package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * CreateAndBindCertBodySSL
 */
@lombok.Data
public final class CreateAndBindCertBodySSL  {

    /**
     * <p>公钥</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PublicKey")
    private String publicKey;

    /**
     * <p>私钥</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PrivateKey")
    private String privateKey;

    /**
     * <p>密钥类型，目前支持rsa、ecc，不填默认为rsa。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "KeyType")
    private String keyType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
