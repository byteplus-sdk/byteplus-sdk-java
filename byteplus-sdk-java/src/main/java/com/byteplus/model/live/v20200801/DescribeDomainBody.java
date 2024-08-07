package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeDomainBody
 */
@lombok.Data
public final class DescribeDomainBody  {

    /**
     * <p>域名列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
