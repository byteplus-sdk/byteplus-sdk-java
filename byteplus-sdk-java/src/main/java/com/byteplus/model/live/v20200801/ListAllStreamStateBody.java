package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * ListAllStreamStateBody
 */
@lombok.Data
public final class ListAllStreamStateBody  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
