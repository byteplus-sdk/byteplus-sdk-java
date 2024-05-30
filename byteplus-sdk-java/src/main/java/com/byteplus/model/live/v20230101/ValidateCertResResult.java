package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ValidateCertResResult
 */
@lombok.Data
public final class ValidateCertResResult  {

    /**
     * <p>证书内容合法</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CertValid")
    private Boolean certValid;

    /**
     * <p>证书与域名是否匹配</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainValid")
    private Boolean domainValid;

    /**
     * <p>检查失败原因</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Reason")
    private String reason;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
