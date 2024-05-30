package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveFeeConfigResResult
 */
@lombok.Data
public final class DescribeLiveFeeConfigResResult  {

    /**
     * <p>配置id</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Id")
    private Integer id;

    /**
     * <p>账号id</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AccountId")
    private String accountId;

    /**
     * <p>上浮系数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Factor")
    private Float factor;

    /**
     * <p>进制</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Base")
    private Integer base;

    /**
     * <p>上浮系数生效时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>配置创建者</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Creator")
    private String creator;

    /**
     * <p>闲忙时开关</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StageEnable")
    private Object stageEnable;

    /**
     * <p>闲忙时生效时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StageTime")
    private String stageTime;

    /**
     * <p>免流配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FreeFeeList")
    private List<String> freeFeeList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
