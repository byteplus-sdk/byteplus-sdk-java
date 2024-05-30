package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeActionHistoryResResultApplicationInfo
 */
@lombok.Data
public final class DescribeActionHistoryResResultApplicationInfo  {

    /**
     * <p>变更平台工单ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ID")
    private String iD;

    /**
     * <p>配置平台</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ApplicationURL")
    private String applicationURL;

    /**
     * <p>变更平台的状态</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private String status;

    /**
     * <p>审批人</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ApproveUserID")
    private List<String> approveUserID;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
