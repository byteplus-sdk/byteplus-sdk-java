package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * CreateCertResResult
 */
@lombok.Data
public final class CreateCertResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AccountID")
    private String accountID;

    /**
     * <p>证书 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ChainID")
    private String chainID;

    /**
     * <p>使用该证书的域名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>证书用途，支持的取值包括：</p>
     *
     * <p>- https：https 认证；</p>
     *
     * <p>- sign：签名校验。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UseWay")
    private String useWay;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
