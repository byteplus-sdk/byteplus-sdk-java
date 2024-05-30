package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListVhostDetailByAdminRes
 */
@lombok.Data
public final class ListVhostDetailByAdminRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ListVhostDetailByAdminResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ListVhostDetailByAdminResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
