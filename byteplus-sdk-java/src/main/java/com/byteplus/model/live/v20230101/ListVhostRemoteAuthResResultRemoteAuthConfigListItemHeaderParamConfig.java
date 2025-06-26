package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListVhostRemoteAuthResResultRemoteAuthConfigListItemHeaderParamConfig
 */
@lombok.Data
public final class ListVhostRemoteAuthResResultRemoteAuthConfigListItemHeaderParamConfig  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UseUserParam")
    private Boolean useUserParam;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Params")
    private List<ListVhostRemoteAuthResResultRemoteAuthConfigListItemHeaderParamConfigParamsItem> params;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
