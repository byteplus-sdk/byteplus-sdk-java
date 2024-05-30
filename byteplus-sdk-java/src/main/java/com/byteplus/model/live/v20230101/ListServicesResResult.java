package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListServicesResResult
 */
@lombok.Data
public final class ListServicesResResult  {

    /**
     * <p>总数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Total")
    private String total;

    /**
     * <p>services列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "List")
    private List<ListServicesResResultListItem> list;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
