package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * ListCertBody
 */
@lombok.Data
public final class ListCertBody  {

    /**
     * <p>火山引擎账号 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AccountID")
    private String accountID;

    /**
     * <p>是否启用证书，默认值为 true，支持的取值包括：</p>
     *
     * <p>- true：启用证书；</p>
     *
     * <p>- false：禁用证书。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Available")
    private Boolean available;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>证书是否过期，默认值为 false，支持的取值包括：</p>
     *
     * <p>- false：表示证书未过期；</p>
     *
     * <p>- true：表示证书已过期。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Expiring")
    private Boolean expiring;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
