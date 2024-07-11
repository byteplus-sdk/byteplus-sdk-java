package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * ApproveServiceBody
 */
@lombok.Data
public final class ApproveServiceBody  {

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

    /**
     * <p>审批状态</p>
     *
     * <p> 0:审批通过，3：审批不通过，4试用期</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ApproveStatus")
    private String approveStatus;

    /**
     * <p>试用时长</p>
     *
     * <p>0：1周，1：1个月，2：两个月，3：三个月，4：半年</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TrailOption")
    private String trailOption;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
