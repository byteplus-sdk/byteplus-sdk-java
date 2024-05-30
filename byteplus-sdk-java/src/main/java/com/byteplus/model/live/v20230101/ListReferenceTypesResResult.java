package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListReferenceTypesResResult
 */
@lombok.Data
public final class ListReferenceTypesResResult  {

    /**
     * <p>引用类型列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TypeList")
    private List<String> typeList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
