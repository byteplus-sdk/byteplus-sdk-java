package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateTicketBodyGroupParam
 */
@lombok.Data
public final class CreateTicketBodyGroupParam  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "GroupStrategy")
    private Integer groupStrategy;

    /**
     * <p>分组数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "GroupNum")
    private Integer groupNum;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
