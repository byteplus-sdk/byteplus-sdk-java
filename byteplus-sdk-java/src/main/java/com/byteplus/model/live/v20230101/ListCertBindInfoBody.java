package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListCertBindInfoBody
 */
@lombok.Data
public final class ListCertBindInfoBody  {

    /**
     * <p>一页数量，0 < x <= 1000</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private Integer pageSize;

    /**
     * <p>页码，x >=1</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageNum")
    private Integer pageNum;

    /**
     * <p>域名类型，push，pull-flv</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainTypeList")
    private List<String> domainTypeList;

    /**
     * <p>域名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>域名空间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>过滤HTTPS,0:返回非HTTPS数据，1：返回HTTPS数据，2：返回所有数据，默认不填为1</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HTTPS")
    private Integer hTTPS;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
