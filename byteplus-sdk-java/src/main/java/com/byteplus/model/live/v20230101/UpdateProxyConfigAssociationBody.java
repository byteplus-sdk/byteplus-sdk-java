package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateProxyConfigAssociationBody
 */
@lombok.Data
public final class UpdateProxyConfigAssociationBody  {

    /**
     * <p>账号</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AccountID")
    private String accountID;

    /**
     * <p>代理记录值</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProxyID")
    private Integer proxyID;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
