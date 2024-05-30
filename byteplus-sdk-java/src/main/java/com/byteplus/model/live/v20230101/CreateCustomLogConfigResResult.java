package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateCustomLogConfigResResult
 */
@lombok.Data
public final class CreateCustomLogConfigResResult  {

    /**
     * <p>配置的Id</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Id")
    private String id;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
