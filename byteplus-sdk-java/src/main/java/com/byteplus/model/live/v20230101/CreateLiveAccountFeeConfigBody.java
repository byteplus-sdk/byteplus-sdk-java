package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * CreateLiveAccountFeeConfigBody
 */
@lombok.Data
public final class CreateLiveAccountFeeConfigBody  {

    /**
     * <p>如果id是0，表示创建，否则表示更新</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Id")
    private Integer id;

    /**
     * <p>账号</p>
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
     * <p>免流的类型</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FreeFeeList")
    private List<String> freeFeeList;

    /**
     * <p>上浮系数生效时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>创建者</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Creator")
    private String creator;

    /**
     * <p>是否开启闲忙时，True表示开启，false表示关闭</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StageEnable")
    private Boolean stageEnable;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
