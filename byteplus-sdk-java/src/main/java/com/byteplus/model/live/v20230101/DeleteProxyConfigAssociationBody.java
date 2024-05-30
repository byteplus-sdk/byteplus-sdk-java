package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DeleteProxyConfigAssociationBody
 */
@lombok.Data
public final class DeleteProxyConfigAssociationBody  {

    /**
     * <p>账号</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AccountID")
    private String accountID;

    /**
     * <p>代理记录ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProxyID")
    private Integer proxyID;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
