package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListVideoClassificationsBody
 */
@lombok.Data
public final class ListVideoClassificationsBody  {

    /**
     * <p>空间名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SpaceName")
    private String spaceName;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
