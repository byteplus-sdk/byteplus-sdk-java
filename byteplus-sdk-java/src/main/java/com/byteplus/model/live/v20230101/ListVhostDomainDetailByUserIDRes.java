package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListVhostDomainDetailByUserIDRes
 */
@lombok.Data
public final class ListVhostDomainDetailByUserIDRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ListVhostDomainDetailByUserIDResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ListVhostDomainDetailByUserIDResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
