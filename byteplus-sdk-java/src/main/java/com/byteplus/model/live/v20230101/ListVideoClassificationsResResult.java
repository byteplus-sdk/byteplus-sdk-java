package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListVideoClassificationsResResult
 */
@lombok.Data
public final class ListVideoClassificationsResResult  {

    /**
     * <p>分类列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ClassificationTrees")
    private List<ListVideoClassificationsResResultClassificationTreesItem> classificationTrees;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
