package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListCertResResult
 */
@lombok.Data
public final class ListCertResResult  {

    /**
     * <p>证书列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CertList")
    private List<ListCertResResultCertListItem> certList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
