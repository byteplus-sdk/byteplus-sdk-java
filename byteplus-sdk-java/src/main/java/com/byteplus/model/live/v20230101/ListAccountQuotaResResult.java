package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListAccountQuotaResResult
 */
@lombok.Data
public final class ListAccountQuotaResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AccountQuotaList")
    private List<ListAccountQuotaResResultAccountQuotaListItem> accountQuotaList;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VhostQuotaList")
    private List<ListAccountQuotaResResultVhostQuotaListItem> vhostQuotaList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
