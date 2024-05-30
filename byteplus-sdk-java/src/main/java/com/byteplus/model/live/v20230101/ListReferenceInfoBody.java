package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListReferenceInfoBody
 */
@lombok.Data
public final class ListReferenceInfoBody  {

    /**
     * <p>引用类型列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TypeList")
    private List<String> typeList;

    /**
     * <p>引用名称列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NameList")
    private List<String> nameList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
