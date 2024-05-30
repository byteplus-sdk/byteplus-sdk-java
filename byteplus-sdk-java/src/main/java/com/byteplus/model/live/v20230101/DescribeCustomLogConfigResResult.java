package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeCustomLogConfigResResult
 */
@lombok.Data
public final class DescribeCustomLogConfigResResult  {

    /**
     * <p>如果没有Id，表示创建，带了Id表示更新</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Id")
    private Integer id;

    /**
     * <p>用户账号id</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AccountId")
    private String accountId;

    /**
     * <p>用户账号名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AccountName")
    private String accountName;

    /**
     * <p>日志类型，如果是多个用逗号连接，全选可填*</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LogType")
    private String logType;

    /**
     * <p>日志pattern</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LogPattern")
    private String logPattern;

    /**
     * <p>日志字段名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LogFields")
    private DescribeCustomLogConfigResResultLogFields logFields;

    /**
     * <p>文件名pattern</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FileNamePattern")
    private String fileNamePattern;

    /**
     * <p>文件名字段名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FileNameFields")
    private DescribeCustomLogConfigResResultFileNameFields fileNameFields;

    /**
     * <p>写入的topic</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Topic")
    private String topic;

    /**
     * <p>填1或0，是否补空文件，默认为0</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EmptyFile")
    private Integer emptyFile;

    /**
     * <p>是否每个域名一个文件，默认为false</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SplitDomain")
    private Boolean splitDomain;

    /**
     * <p>切割文件的时间，单位秒，默认3600</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SplitTime")
    private Integer splitTime;

    /**
     * <p>默认false（前端默认填ture），同一个时间范围是否允许按照大小切割文件</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SplitFile")
    private Boolean splitFile;

    /**
     * <p>tce集群名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Cluster")
    private String cluster;

    /**
     * <p>延迟时间，默认300s</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DelayTime")
    private Integer delayTime;

    /**
     * <p>默认0，状态，1：启动，0：禁止</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private Integer status;

    /**
     * <p>日志获取接口名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ActionName")
    private String actionName;

    /**
     * <p>创建人</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Creator")
    private String creator;

    /**
     * <p>切割文件的行数，默认120w</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SplitLine")
    private Integer splitLine;

    /**
     * <p>特殊清洗状态，false:表示数仓单独任务进行清洗，true为通用清洗任务</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "WashStatus")
    private Boolean washStatus;

    /**
     * <p>bmq集群名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BmqCluster")
    private String bmqCluster;

    /**
     * <p>下载时填的Type参数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DownloadType")
    private String downloadType;

    /**
     * <p>排除的账号ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ExcludedAccountIds")
    private String excludedAccountIds;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
