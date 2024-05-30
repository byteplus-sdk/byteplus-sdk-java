package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeDomainVerifyBody
 */
@lombok.Data
public final class DescribeDomainVerifyBody  {

    /**
     * <p>推拉流域名列表，最多十个</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domains")
    private List<String> domains;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
