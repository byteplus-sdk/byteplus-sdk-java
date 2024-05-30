package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListProjectsBody
 */
@lombok.Data
public final class ListProjectsBody  {

    /**
     * <p>每页数量限制，不填默认10</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Limit")
    private Integer limit;

    /**
     * <p>页码，不填默认0</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Offset")
    private Integer offset;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
