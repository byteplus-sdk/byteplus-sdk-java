package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ManagerPullPushDomainBindRes
 */
@lombok.Data
public final class ManagerPullPushDomainBindRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ManagerPullPushDomainBindResResponseMetadata responseMetadata;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
