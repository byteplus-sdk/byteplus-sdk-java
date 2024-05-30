package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListActionHistoryResResult
 */
@lombok.Data
public final class ListActionHistoryResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ActionHistoryList")
    private List<ListActionHistoryResResultActionHistoryListItem> actionHistoryList;

    /**
     * <p>总共的数量</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Total")
    private Integer total;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
