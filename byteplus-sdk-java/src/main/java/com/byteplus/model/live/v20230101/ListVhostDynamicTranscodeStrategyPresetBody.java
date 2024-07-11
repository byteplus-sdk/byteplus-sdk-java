package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListVhostDynamicTranscodeStrategyPresetBody
 */
@lombok.Data
public final class ListVhostDynamicTranscodeStrategyPresetBody  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
