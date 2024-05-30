package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListHeaderEnumResResultVariableListItem
 */
@lombok.Data
public final class ListHeaderEnumResResultVariableListItem  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Prompt")
    private String prompt;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
