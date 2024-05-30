package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateRelaySourceV3BodyGroupDetailsItemAuthParams
 */
@lombok.Data
public final class UpdateRelaySourceV3BodyGroupDetailsItemAuthParams  {

    /**
     * <p>鉴权参数名，如“sign”</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VolcSecret")
    private String volcSecret;

    /**
     * <p>有效期，如"expire"</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VolcTime")
    private String volcTime;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
