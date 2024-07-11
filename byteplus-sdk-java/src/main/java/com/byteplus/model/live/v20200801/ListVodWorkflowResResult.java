package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListVodWorkflowResResult
 */
@lombok.Data
public final class ListVodWorkflowResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CurPage")
    private Integer curPage;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Total")
    private Integer total;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Workflow")
    private List<ListVodWorkflowResResultWorkflowItem> workflow;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
