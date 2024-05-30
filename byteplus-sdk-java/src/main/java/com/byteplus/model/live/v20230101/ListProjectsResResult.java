package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListProjectsResResult
 */
@lombok.Data
public final class ListProjectsResResult  {

    /**
     * <p>项目列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Projects")
    private List<ListProjectsResResultProjectsItem> projects;

    /**
     * <p>每页数量</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Limit")
    private Integer limit;

    /**
     * <p>页码</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Offset")
    private Integer offset;

    /**
     * <p>总数量</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Total")
    private Integer total;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
