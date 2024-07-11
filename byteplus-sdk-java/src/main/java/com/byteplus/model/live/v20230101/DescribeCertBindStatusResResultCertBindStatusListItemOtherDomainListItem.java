package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeCertBindStatusResResultCertBindStatusListItemOtherDomainListItem
 */
@lombok.Data
public final class DescribeCertBindStatusResResultCertBindStatusListItemOtherDomainListItem  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ChainID")
    private String chainID;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private Boolean status;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
