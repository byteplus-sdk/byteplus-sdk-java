package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeRelaySourceV2ResResultRelaySourceConfigItem
 */
@lombok.Data
public final class DescribeRelaySourceV2ResResultRelaySourceConfigItem  {

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
    private List<DescribeRelaySourceV2ResResultRelaySourceConfigItemGroupListItem> groupList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
