package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListHeaderEnumBody
 */
@lombok.Data
public final class ListHeaderEnumBody  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Phase")
    private Integer phase;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
