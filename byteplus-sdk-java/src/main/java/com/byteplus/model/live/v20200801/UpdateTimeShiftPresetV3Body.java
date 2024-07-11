package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * UpdateTimeShiftPresetV3Body
 */
@lombok.Data
public final class UpdateTimeShiftPresetV3Body  {

    /**
     * <p>域名空间名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>应用名称，由 1 到 30 位数字、字母、下划线及"-"和"."组成</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>开启时移的流名称，同一个 App 最多可指定 20 路</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>最大时移时长，即观看时移的最长时间，单位为 s。支持的取值如下所示。</p>
     *
     *
     *
     * <p>- 86400</p>
     *
     * <p>- 259200</p>
     *
     * <p>- 604800</p>
     *
     * <p>- 1296000</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MaxShiftTime")
    private Integer maxShiftTime;

    /**
     * <p>用于多码率时移的参数，为json字符串</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MasterFormat")
    private String masterFormat;

    /**
     * <p>0表示不需要 1表示需要</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NeedTranscode")
    private Integer needTranscode;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RecordObject")
    private String recordObject;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
