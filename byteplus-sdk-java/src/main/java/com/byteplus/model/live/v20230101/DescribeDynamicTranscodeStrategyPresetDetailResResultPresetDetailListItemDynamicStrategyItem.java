package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeDynamicTranscodeStrategyPresetDetailResResultPresetDetailListItemDynamicStrategyItem
 */
@lombok.Data
public final class DescribeDynamicTranscodeStrategyPresetDetailResResultPresetDetailListItemDynamicStrategyItem  {

    /**
     * <p>策略标识，对应内部冷流、温流、热流等配置。</p>
     *
     * <p>- 1：一级策略</p>
     *
     * <p>- 2：二级策略</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TriggerTag")
    private String triggerTag;

    /**
     * <p>策略类型，可选origin(跟随源流)，transcode(转码策略)</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StrategyMode")
    private String strategyMode;

    /**
     * <p>进入下一级策略的人数，取值 [1,10000]，-1 表示正无穷，最高级策略默认为 -1。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TriggerUpperLimit")
    private Integer triggerUpperLimit;

    /**
     * <p>这个策略触发的最低人数，取值 [1,10000]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TriggerLowerLimit")
    private Integer triggerLowerLimit;

    /**
     * <p>策略参数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StrategyParams")
    private DescribeDynamicTranscodeStrategyPresetDetailResResultPresetDetailListItemDynamicStrategyItemStrategyParams strategyParams;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
