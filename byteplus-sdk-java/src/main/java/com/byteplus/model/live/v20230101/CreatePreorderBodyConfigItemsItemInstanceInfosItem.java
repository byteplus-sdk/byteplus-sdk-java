package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreatePreorderBodyConfigItemsItemInstanceInfosItem
 */
@lombok.Data
public final class CreatePreorderBodyConfigItemsItemInstanceInfosItem  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "InstanceID")
    private String instanceID;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "InstanceName")
    private String instanceName;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
