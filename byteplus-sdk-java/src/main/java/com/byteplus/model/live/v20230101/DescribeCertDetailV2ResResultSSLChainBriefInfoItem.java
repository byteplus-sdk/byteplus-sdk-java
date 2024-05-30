package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeCertDetailV2ResResultSSLChainBriefInfoItem
 */
@lombok.Data
public final class DescribeCertDetailV2ResResultSSLChainBriefInfoItem  {

    /**
     * <p>证书指纹（SHA1）</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FingerprintSHA1")
    private String fingerprintSHA1;

    /**
     * <p>证书指纹（SHA256）</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FingerprintSHA256")
    private String fingerprintSHA256;

    /**
     * <p>加密算法</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EncryptionAlgorithm")
    private String encryptionAlgorithm;

    /**
     * <p>签名算法</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SignatureAlgorithm")
    private String signatureAlgorithm;

    /**
     * <p>主题信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Subject")
    private String subject;

    /**
     * <p>签发者信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Issuer")
    private String issuer;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
