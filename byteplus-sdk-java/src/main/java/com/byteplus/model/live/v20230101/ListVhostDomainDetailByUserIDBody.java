package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListVhostDomainDetailByUserIDBody
 */
@lombok.Data
public final class ListVhostDomainDetailByUserIDBody  {

    /**
     * <p>账号</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AccountID")
    private String accountID;

    /**
     * <p>子账号userID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserID")
    private String userID;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
