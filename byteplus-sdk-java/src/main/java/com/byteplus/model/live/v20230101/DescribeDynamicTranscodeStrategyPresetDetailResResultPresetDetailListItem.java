package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeDynamicTranscodeStrategyPresetDetailResResultPresetDetailListItem
 */
@lombok.Data
public final class DescribeDynamicTranscodeStrategyPresetDetailResResultPresetDetailListItem  {

    /**
     * <p>模板名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetName")
    private String presetName;

    /**
     * <p>状态。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private Integer status;

    /**
     * <p>模板描述。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Description")
    private String description;

    /**
     * <p>触发的开始时间，格式HH:MM:SS，如18:30:00，TriggerStartTime 和 TriggerEndTime 都不填是全天触发。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TriggerStartTime")
    private String triggerStartTime;

    /**
     * <p>触发的结束时间，格式HH:MM:SS，如18:30:00，TriggerStartTime 和 TriggerEndTime 都不填是全天触发。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TriggerEndTime")
    private String triggerEndTime;

    /**
     * <p>触发策略后的冷却时间，单位秒</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TriggerCoolingTime")
    private Integer triggerCoolingTime;

    /**
     * <p>触发策略后，在线人数允许的波动阈值，取值 [0,1]，取两位小数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Sensitivity")
    private Float sensitivity;

    /**
     * <p>策略配置具体参数，列表形式，包括策略阈值等信息，需确保各配置的策略阈值为连续区间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DynamicStrategy")
    private List<DescribeDynamicTranscodeStrategyPresetDetailResResultPresetDetailListItemDynamicStrategyItem> dynamicStrategy;

    /**
     * <p>热流阈值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TriggerThreshold")
    private Integer triggerThreshold;

    /**
     * <p>转码后缀，生效类型为转码时必填，必须事先创建相应后缀的转码模板，一个后缀只能创建一个策略模板。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SuffixName")
    private String suffixName;

    /**
     * <p>生效类型。</p>
     *
     * <p>- trans：转码</p>
     *
     * <p>- origin：源流</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EffectiveType")
    private String effectiveType;

    /**
     * <p>创建时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreatedAt")
    private Integer createdAt;

    /**
     * <p>更新时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UpdatedAt")
    private Integer updatedAt;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
