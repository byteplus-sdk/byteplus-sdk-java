package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateRelaySinkBodyRelaySinkDetailListItemPullDomainListItem
 */
@lombok.Data
public final class UpdateRelaySinkBodyRelaySinkDetailListItemPullDomainListItem  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PullDomain")
    private String pullDomain;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Protocol")
    private String protocol;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
