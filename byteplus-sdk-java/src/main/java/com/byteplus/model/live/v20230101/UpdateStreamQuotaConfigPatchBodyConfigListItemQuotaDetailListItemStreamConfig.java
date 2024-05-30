package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateStreamQuotaConfigPatchBodyConfigListItemQuotaDetailListItemStreamConfig
 */
@lombok.Data
public final class UpdateStreamQuotaConfigPatchBodyConfigListItemQuotaDetailListItemStreamConfig  {

    /**
     * <p>推流路数限额，取值[10~200000]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Quota")
    private Integer quota;

    /**
     * <p>推流路数限额告警阈值，缺省情况表示不设置告警。取值范围为 \[10,200000\]。</p>
     *
     * <p>:::tip</p>
     *
     * <p>该参数的取值需要小于等于推流路数限额 `Quota`，否则会报错。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AlarmThreshold")
    private Integer alarmThreshold;

    /**
     * <p>限制的推流的qps，>= -1</p>
     *
     * <p>0:使用调度默认限制</p>
     *
     * <p>-1：不限制</p>
     *
     * <p>xx>0: 具体数据，则限制为xx qps</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "QPSLimit")
    private Integer qPSLimit;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
