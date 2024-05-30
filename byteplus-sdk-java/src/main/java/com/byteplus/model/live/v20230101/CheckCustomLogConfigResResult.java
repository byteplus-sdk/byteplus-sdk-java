package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CheckCustomLogConfigResResult
 */
@lombok.Data
public final class CheckCustomLogConfigResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private Integer status;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Message")
    private String message;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
