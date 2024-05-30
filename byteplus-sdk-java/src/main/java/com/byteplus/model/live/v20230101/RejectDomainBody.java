package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * RejectDomainBody
 */
@lombok.Data
public final class RejectDomainBody  {

    /**
     * <p>域名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
