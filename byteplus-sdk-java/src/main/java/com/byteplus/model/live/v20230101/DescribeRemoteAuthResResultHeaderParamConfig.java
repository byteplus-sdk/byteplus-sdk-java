package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeRemoteAuthResResultHeaderParamConfig
 */
@lombok.Data
public final class DescribeRemoteAuthResResultHeaderParamConfig  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UseUserParam")
    private Boolean useUserParam;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Params")
    private List<DescribeRemoteAuthResResultHeaderParamConfigParamsItem> params;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
