package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribeCertDetailSecretResResult
 */
@lombok.Data
public final class DescribeCertDetailSecretResResult  {

    /**
     * <p>证书名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CertName")
    private String certName;

    /**
     * <p>证书 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ChainID")
    private String chainID;

    /**
     * <p>与证书绑定的域名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>证书详细信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Rsa")
    private DescribeCertDetailSecretResResultRsa rsa;

    /**
     * <p>证书状态</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private String status;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UseWay")
    private String useWay;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
