package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListVodWorkflowResResultWorkflowItem
 */
@lombok.Data
public final class ListVodWorkflowResResultWorkflowItem  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ID")
    private String iD;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
