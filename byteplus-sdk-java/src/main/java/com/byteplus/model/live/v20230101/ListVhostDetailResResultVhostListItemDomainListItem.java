package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListVhostDetailResResultVhostListItemDomainListItem
 */
@lombok.Data
public final class ListVhostDetailResResultVhostListItemDomainListItem  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CNAME")
    private String cNAME;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CertDomain")
    private String certDomain;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CertName")
    private String certName;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ChainID")
    private String chainID;

    /**
     * <p>创建时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateTime")
    private String createTime;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Priority")
    private Integer priority;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PushDomain")
    private String pushDomain;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Region")
    private String region;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private Integer status;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>项目名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProjectName")
    private String projectName;

    /**
     * <p>标签</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Tags")
    private ListVhostDetailResResultVhostListItemDomainListItemTags tags;

    /**
     * <p>更新时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UpdateTime")
    private String updateTime;

    /**
     * <p>故障域。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FRegion")
    private String fRegion;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
