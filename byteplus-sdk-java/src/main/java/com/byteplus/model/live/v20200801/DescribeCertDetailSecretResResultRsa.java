package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribeCertDetailSecretResResultRsa
 */
@lombok.Data
public final class DescribeCertDetailSecretResResultRsa  {

    /**
     * <p>证书类型。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CertType")
    private String certType;

    /**
     * <p>证书指纹，为唯一值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FingerPrint")
    private String fingerPrint;

    /**
     * <p>证书过期时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NotAfter")
    private String notAfter;

    /**
     * <p>证书生效时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NotBefore")
    private String notBefore;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PriKey")
    private String priKey;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PriName")
    private String priName;

    /**
     * <p>公钥数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PubKey")
    private String pubKey;

    /**
     * <p>系统自动生成的公钥文本名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PubName")
    private String pubName;

    /**
     * <p>证书序列号，为唯一值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SerialNumber")
    private String serialNumber;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
