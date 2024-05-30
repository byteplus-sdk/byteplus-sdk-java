package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetAppsResResult
 */
@lombok.Data
public final class GetAppsResResult  {

    /**
     * <p>app列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Apps")
    private List<GetAppsResResultAppsItem> apps;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
