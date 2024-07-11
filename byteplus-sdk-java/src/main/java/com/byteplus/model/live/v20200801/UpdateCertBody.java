package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * UpdateCertBody
 */
@lombok.Data
public final class UpdateCertBody  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AccountID")
    private String accountID;

    /**
     * <p>更新后的证书名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CertName")
    private String certName;

    /**
     * <p>需要更新证书名称的证书链 ID，可以通过[查询证书列表](https://www.volcengine.com/docs/6469/81242)接口获取</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ChainID")
    private String chainID;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Rsa")
    private UpdateCertBodyRsa rsa;

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
