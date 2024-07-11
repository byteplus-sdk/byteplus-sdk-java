package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * RejectServiceBody
 */
@lombok.Data
public final class RejectServiceBody  {

    /**
     * <p>用户账号</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AccountID")
    private String accountID;

    /**
     * <p>审批人ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ApproverID")
    private String approverID;

    /**
     * <p>审批人姓名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ApproverName")
    private String approverName;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
