package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeCertDetailV2ResResult
 */
@lombok.Data
public final class DescribeCertDetailV2ResResult  {

    /**
     * <p>证书包含的域名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CertDomainList")
    private List<String> certDomainList;

    /**
     * <p>证书链ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ChainID")
    private String chainID;

    /**
     * <p>证书详细信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SSL")
    private DescribeCertDetailV2ResResultSSL sSL;

    /**
     * <p>证书名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CertName")
    private String certName;

    /**
     * <p>证书的生效日期，RFC3339 格式的 UTC 时间，精度为 s</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NotBefore")
    private String notBefore;

    /**
     * <p>证书的过期时间，RFC3339 格式的 UTC 时间，精度为 s</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NotAfter")
    private String notAfter;

    /**
     * <p>证书的状态过期时间，"OK",  "Expire",  "1days", "7days",  "15days",  "30days"</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private String status;

    /**
     * <p>openssl解析结果</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OpenSSLFormat")
    private String openSSLFormat;

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
     * <p>签名算法</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SignatureAlgorithm")
    private String signatureAlgorithm;

    /**
     * <p>加密算法</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EncryptionAlgorithm")
    private String encryptionAlgorithm;

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
