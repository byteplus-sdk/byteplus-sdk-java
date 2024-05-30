package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DeleteCustomLogConfigResResult
 */
@lombok.Data
public final class DeleteCustomLogConfigResResult  {

    /**
     * <p>删除的配置Id</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Id")
    private String id;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
