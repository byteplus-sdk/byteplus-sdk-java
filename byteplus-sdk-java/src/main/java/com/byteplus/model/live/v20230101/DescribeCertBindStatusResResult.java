package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeCertBindStatusResResult
 */
@lombok.Data
public final class DescribeCertBindStatusResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CertBindStatusList")
    private List<DescribeCertBindStatusResResultCertBindStatusListItem> certBindStatusList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
