package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListPostProcessTaskDetailResResultListPostProcessTaskDetailResult
 */
@lombok.Data
public final class ListPostProcessTaskDetailResResultListPostProcessTaskDetailResult  {

    /**
     * <p>总数据条数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Total")
    private Integer total;

    /**
     * <p>任务详情列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "List")
    private List<ListPostProcessTaskDetailResResultListPostProcessTaskDetailResultListItem> list;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
