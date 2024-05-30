package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * GenerateTimeShiftPlayURLBody
 */
@lombok.Data
public final class GenerateTimeShiftPlayURLBody  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ExpireTime")
    private String expireTime;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeShiftURL")
    private String timeShiftURL;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VodSpacename")
    private String vodSpacename;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
