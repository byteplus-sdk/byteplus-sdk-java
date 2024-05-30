package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;
import java.util.Map;

/**
 * ListVideoClassificationsResResultClassificationTreesItem
 */
@lombok.Data
public final class ListVideoClassificationsResResultClassificationTreesItem  {

    /**
     * <p>空间名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SpaceName")
    private String spaceName;

    /**
     * <p>分类级别，1：一级，2：二级，3：三级</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Level")
    private Integer level;

    /**
     * <p>分类ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ClassificationID")
    private String classificationID;

    /**
     * <p>分类名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Classification")
    private String classification;

    /**
     * <p>父分类ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ParentClassificationID")
    private String parentClassificationID;

    /**
     * <p>与ClassificationTrees相同</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SubClassificationTrees")
    private List<Map<String, Object>> subClassificationTrees;

    /**
     * <p>创建时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreatedAt")
    private String createdAt;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
