package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * ListVQScoreTaskResResultTaskListItem
 */
@lombok.Data
public final class ListVQScoreTaskResResultTaskListItem  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ID")
    private String iD;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Duration")
    private String duration;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private String status;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AccountID")
    private String accountID;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
