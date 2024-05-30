package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListProjectsResResultProjectsItem
 */
@lombok.Data
public final class ListProjectsResResultProjectsItem  {

    /**
     * <p>账号</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AccountID")
    private String accountID;

    /**
     * <p>项目名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProjectName")
    private String projectName;

    /**
     * <p>父项目名称，没有为空</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ParentProjectName")
    private String parentProjectName;

    /**
     * <p>从根节点到当前节点的路径</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Path")
    private String path;

    /**
     * <p>项目展示名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DisplayName")
    private String displayName;

    /**
     * <p>创建时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateDate")
    private String createDate;

    /**
     * <p>更新时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UpdateDate")
    private String updateDate;

    /**
     * <p>状态</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private String status;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
