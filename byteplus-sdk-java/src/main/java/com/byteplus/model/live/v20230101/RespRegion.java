package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * RespRegion
 */
@lombok.Data
public final class RespRegion  {

    /**
     * <p>The regional identifier in regional information.</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Area")
    private String area;

    /**
     * <p>The country identifier in the regional information.</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Country")
    private String country;

    /**
     * <p>The province identifier in the regional information.</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Province")
    private String province;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
