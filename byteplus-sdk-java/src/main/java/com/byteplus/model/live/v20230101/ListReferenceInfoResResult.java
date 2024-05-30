package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListReferenceInfoResResult
 */
@lombok.Data
public final class ListReferenceInfoResResult  {

    /**
     * <p>配置列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ReferenceInfos")
    private List<ListReferenceInfoResResultReferenceInfosItem> referenceInfos;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
