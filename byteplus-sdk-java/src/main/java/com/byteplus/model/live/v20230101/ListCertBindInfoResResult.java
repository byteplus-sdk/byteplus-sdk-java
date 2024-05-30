package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListCertBindInfoResResult
 */
@lombok.Data
public final class ListCertBindInfoResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CertBindList")
    private List<ListCertBindInfoResResultCertBindListItem> certBindList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
