package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeEncryptDRMResResultDRMItem
 */
@lombok.Data
public final class DescribeEncryptDRMResResultDRMItem  {

    /**
     * <p>apikey</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "APIKey")
    private String aPIKey;

    /**
     * <p>证书名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CertificateName")
    private String certificateName;

    /**
     * <p>私钥文件名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PrivateKeyFileName")
    private String privateKeyFileName;

    /**
     * <p>证书文件名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CertificateFileName")
    private String certificateFileName;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ApplicationSecretKey")
    private String applicationSecretKey;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PrivateKey")
    private String privateKey;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
