package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeDomainVerifyResResult
 */
@lombok.Data
public final class DescribeDomainVerifyResResult  {

    /**
     * <p>校验返回列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<DescribeDomainVerifyResResultDomainListItem> domainList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
