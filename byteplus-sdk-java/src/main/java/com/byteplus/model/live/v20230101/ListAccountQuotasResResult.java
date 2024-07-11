package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListAccountQuotasResResult
 */
@lombok.Data
public final class ListAccountQuotasResResult  {

    /**
     * <p>配置列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Quotas")
    private List<ListAccountQuotasResResultQuotasItem> quotas;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
