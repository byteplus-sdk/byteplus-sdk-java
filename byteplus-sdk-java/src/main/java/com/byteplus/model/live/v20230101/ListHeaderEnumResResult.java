package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListHeaderEnumResResult
 */
@lombok.Data
public final class ListHeaderEnumResResult  {

    /**
     * <p>常量列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConstantList")
    private List<ListHeaderEnumResResultConstantListItem> constantList;

    /**
     * <p>变量列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VariableList")
    private List<ListHeaderEnumResResultVariableListItem> variableList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
