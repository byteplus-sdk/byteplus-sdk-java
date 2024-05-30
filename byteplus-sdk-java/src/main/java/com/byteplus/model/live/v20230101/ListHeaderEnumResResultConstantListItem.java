package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListHeaderEnumResResultConstantListItem
 */
@lombok.Data
public final class ListHeaderEnumResResultConstantListItem  {

    /**
     * <p>常量名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>提示词</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Prompt")
    private String prompt;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
