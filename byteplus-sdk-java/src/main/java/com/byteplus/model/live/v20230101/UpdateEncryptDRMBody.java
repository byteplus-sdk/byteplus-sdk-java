package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateEncryptDRMBody
 */
@lombok.Data
public final class UpdateEncryptDRMBody  {

    /**
     * <p>标准DRM的ApiKey</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "APIKey")
    private String aPIKey;

    /**
     * <p>证书名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CertificateName")
    private String certificateName;

    /**
     * <p>私钥文件内容</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PrivateKeyFile")
    private String privateKeyFile;

    /**
     * <p>私钥文件名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PrivateKeyFileName")
    private String privateKeyFileName;

    /**
     * <p>证书文件内容</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CertificateFile")
    private String certificateFile;

    /**
     * <p>证书文件名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CertificateFileName")
    private String certificateFileName;

    /**
     * <p>向Apple申请的ask</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ApplicationSecretKey")
    private String applicationSecretKey;

    /**
     * <p>私钥密码</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PrivateKey")
    private String privateKey;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
