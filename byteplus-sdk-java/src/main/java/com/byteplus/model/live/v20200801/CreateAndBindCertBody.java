package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * CreateAndBindCertBody
 */
@lombok.Data
public final class CreateAndBindCertBody  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SSL")
    private CreateAndBindCertBodySSL sSL;

    /**
     * <p>证书名称，若不传默认使用解析出的common name</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CertName")
    private String certName;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
