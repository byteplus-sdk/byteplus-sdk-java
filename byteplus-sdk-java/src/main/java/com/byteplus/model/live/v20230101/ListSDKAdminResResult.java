package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListSDKAdminResResult
 */
@lombok.Data
public final class ListSDKAdminResResult  {

    /**
     * <p>总数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Total")
    private Integer total;

    /**
     * <p>列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "List")
    private List<ListSDKAdminResResultListItem> list;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
