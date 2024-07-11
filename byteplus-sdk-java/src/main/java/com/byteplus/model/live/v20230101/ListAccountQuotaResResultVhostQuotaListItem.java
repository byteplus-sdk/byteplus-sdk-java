package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListAccountQuotaResResultVhostQuotaListItem
 */
@lombok.Data
public final class ListAccountQuotaResResultVhostQuotaListItem  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VhostName")
    private String vhostName;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "QuotaList")
    private List<ListAccountQuotaResResultVhostQuotaListItemQuotaListItem> quotaList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
