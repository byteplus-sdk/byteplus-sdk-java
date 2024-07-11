package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribeStreamQuotaConfigResResultQuotaListItemQuotaDetailListItemStreamConfig
 */
@lombok.Data
public final class DescribeStreamQuotaConfigResResultQuotaListItemQuotaDetailListItemStreamConfig  {

    /**
     * <p>推流路数限额</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Quota")
    private Integer quota;

    /**
     * <p>推流路数限额告警阈值，缺省情况表示未设置告警</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AlarmThreshold")
    private Integer alarmThreshold;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
