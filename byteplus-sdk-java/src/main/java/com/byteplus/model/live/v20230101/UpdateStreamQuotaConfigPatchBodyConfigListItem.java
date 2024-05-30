package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateStreamQuotaConfigPatchBodyConfigListItem
 */
@lombok.Data
public final class UpdateStreamQuotaConfigPatchBodyConfigListItem  {

    /**
     * <p>限额配置详情。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "QuotaDetailList")
    private List<UpdateStreamQuotaConfigPatchBodyConfigListItemQuotaDetailListItem> quotaDetailList;

    /**
     * <p>需要配置限额的域名空间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
