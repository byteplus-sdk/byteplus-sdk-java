package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListCertV2ResResult
 */
@lombok.Data
public final class ListCertV2ResResult  {

    /**
     * <p>证书信息列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CertList")
    private List<ListCertV2ResResultCertListItem> certList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
