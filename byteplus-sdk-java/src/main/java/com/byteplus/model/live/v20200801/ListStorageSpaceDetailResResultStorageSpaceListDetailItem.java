package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * ListStorageSpaceDetailResResultStorageSpaceListDetailItem
 */
@lombok.Data
public final class ListStorageSpaceDetailResResultStorageSpaceListDetailItem  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AccountID")
    private String accountID;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PublicDomain")
    private String publicDomain;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CnameDomain")
    private String cnameDomain;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TTL")
    private Integer tTL;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
