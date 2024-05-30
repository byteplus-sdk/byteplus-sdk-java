package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * TerminateInstanceBody
 */
@lombok.Data
public final class TerminateInstanceBody  {

    /**
     * <p>账号</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AccountID")
    private String accountID;

    /**
     * <p>产品</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Product")
    private String product;

    /**
     * <p>实例号</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "InstanceNo")
    private String instanceNo;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
