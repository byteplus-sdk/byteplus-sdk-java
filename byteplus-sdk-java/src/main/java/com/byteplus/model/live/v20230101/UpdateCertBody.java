package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateCertBody
 */
@lombok.Data
public final class UpdateCertBody  {

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
     * <p>证书用途，支持的取值包括：</p>
     *
     *
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
