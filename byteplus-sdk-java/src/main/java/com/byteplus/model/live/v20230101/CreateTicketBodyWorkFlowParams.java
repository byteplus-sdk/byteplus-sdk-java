package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateTicketBodyWorkFlowParams
 */
@lombok.Data
public final class CreateTicketBodyWorkFlowParams  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "WaitTime")
    private Integer waitTime;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
