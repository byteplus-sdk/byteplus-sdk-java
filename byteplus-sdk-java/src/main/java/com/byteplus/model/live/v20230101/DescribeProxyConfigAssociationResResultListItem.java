package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeProxyConfigAssociationResResultListItem
 */
@lombok.Data
public final class DescribeProxyConfigAssociationResResultListItem  {

    /**
     * <p>账号</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AccountID")
    private String accountID;

    /**
     * <p>代理列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProxyConfigList")
    private List<DescribeProxyConfigAssociationResResultListItemProxyConfigListItem> proxyConfigList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
