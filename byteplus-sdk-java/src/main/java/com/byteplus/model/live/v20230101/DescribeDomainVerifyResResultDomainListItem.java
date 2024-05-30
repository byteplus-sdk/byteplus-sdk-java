package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeDomainVerifyResResultDomainListItem
 */
@lombok.Data
public final class DescribeDomainVerifyResResultDomainListItem  {

    /**
     * <p>推拉流域名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domains")
    private List<String> domains;

    /**
     * <p>true: 已经校验</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Verify")
    private Boolean verify;

    /**
     * <p>根域名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RootDomain")
    private String rootDomain;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
