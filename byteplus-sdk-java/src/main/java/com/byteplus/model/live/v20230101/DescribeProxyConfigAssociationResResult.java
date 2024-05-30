package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeProxyConfigAssociationResResult
 */
@lombok.Data
public final class DescribeProxyConfigAssociationResResult  {

    /**
     * <p>关联列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "List")
    private List<DescribeProxyConfigAssociationResResultListItem> list;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
