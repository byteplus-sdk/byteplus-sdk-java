package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateStreamQuotaConfigPatchBody
 */
@lombok.Data
public final class UpdateStreamQuotaConfigPatchBody  {

    /**
     * <p>批量添加限制，最多30个</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConfigList")
    private List<UpdateStreamQuotaConfigPatchBodyConfigListItem> configList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
