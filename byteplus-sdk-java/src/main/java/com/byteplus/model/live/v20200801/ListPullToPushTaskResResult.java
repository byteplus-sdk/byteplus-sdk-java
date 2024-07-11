package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListPullToPushTaskResResult
 */
@lombok.Data
public final class ListPullToPushTaskResResult  {

    /**
     * <p>任务列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "List")
    private List<ListPullToPushTaskResResultListItem> list;

    /**
     * <p>分页数量信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Pagination")
    private ListPullToPushTaskResResultPagination pagination;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
