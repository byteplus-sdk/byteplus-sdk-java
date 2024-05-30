package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateStreamQuotaConfigPatchBodyConfigListItemQuotaDetailListItem
 */
@lombok.Data
public final class UpdateStreamQuotaConfigPatchBodyConfigListItemQuotaDetailListItem  {

    /**
     * <p>目前域名空间只支持推流路数配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StreamConfig")
    private UpdateStreamQuotaConfigPatchBodyConfigListItemQuotaDetailListItemStreamConfig streamConfig;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
