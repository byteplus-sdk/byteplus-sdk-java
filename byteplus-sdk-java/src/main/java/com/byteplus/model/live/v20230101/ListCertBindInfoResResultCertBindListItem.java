package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListCertBindInfoResResultCertBindListItem
 */
@lombok.Data
public final class ListCertBindInfoResResultCertBindListItem  {

    /**
     * <p>域名空间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>域名绑定的域名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>证书域名列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CertDomainList")
    private List<String> certDomainList;

    /**
     * <p>证书实例ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CertID")
    private String certID;

    /**
     * <p>证书名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CertName")
    private String certName;

    /**
     * <p>域名类型</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainType")
    private String domainType;

    /**
     * <p>是否https</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HTTPS")
    private Boolean hTTPS;

    /**
     * <p>有效期</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NotAfter")
    private String notAfter;

    /**
     * <p>生效时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NotBefore")
    private String notBefore;

    /**
     * <p>证书链ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ChainID")
    private String chainID;

    /**
     * <p>账号</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AccountID")
    private String accountID;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
