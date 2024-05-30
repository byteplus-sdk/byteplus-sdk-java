package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeRelaySinkResResultRelaySinkListItem
 */
@lombok.Data
public final class DescribeRelaySinkResResultRelaySinkListItem  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "GroupList")
    private List<DescribeRelaySinkResResultRelaySinkListItemGroupListItem> groupList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
