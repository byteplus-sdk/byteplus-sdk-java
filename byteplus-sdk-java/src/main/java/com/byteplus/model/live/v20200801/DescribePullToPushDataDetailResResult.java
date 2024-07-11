package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribePullToPushDataDetailResResult
 */
@lombok.Data
public final class DescribePullToPushDataDetailResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "List")
    private List<DescribePullToPushDataDetailResResultListItem> list;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Pagination")
    private DescribePullToPushDataDetailResResultPagination pagination;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
