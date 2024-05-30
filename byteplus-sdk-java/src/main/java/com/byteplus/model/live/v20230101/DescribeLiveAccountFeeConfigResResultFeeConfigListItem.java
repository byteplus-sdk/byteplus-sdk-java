package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveAccountFeeConfigResResultFeeConfigListItem
 */
@lombok.Data
public final class DescribeLiveAccountFeeConfigResResultFeeConfigListItem  {

    /**
     * <p>配置id</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Id")
    private Integer id;

    /**
     * <p>是否开启闲忙时</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StageEnable")
    private Boolean stageEnable;

    /**
     * <p>闲忙时生效时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StageTime")
    private String stageTime;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FreeFeeList")
    private List<String> freeFeeList;

    /**
     * <p>更新时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UpdateTime")
    private String updateTime;

    /**
     * <p>创建时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateTime")
    private String createTime;

    /**
     * <p>创建者</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Creator")
    private String creator;

    /**
     * <p>上浮系数生效时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>进制</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Base")
    private Integer base;

    /**
     * <p>上浮系数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Factor")
    private Float factor;

    /**
     * <p>账号id</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AccountId")
    private String accountId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
