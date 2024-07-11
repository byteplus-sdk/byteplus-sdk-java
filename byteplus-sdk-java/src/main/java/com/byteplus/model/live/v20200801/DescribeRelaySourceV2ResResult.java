package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeRelaySourceV2ResResult
 */
@lombok.Data
public final class DescribeRelaySourceV2ResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RelaySourceConfig")
    private List<DescribeRelaySourceV2ResResultRelaySourceConfigItem> relaySourceConfig;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
