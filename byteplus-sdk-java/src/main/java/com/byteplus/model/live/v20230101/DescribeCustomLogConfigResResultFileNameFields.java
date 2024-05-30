package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeCustomLogConfigResResultFileNameFields
 */
@lombok.Data
public final class DescribeCustomLogConfigResResultFileNameFields  {

    /**
     * <p>字段对应中文名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "KeyCn")
    private String keyCn;

    /**
     * <p>字段名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Key")
    private String key;

    /**
     * <p>敏感词替换字符串，比如：ab,cd 表示用cd替换ab，如果有多组替换用分号连接</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Transform")
    private Integer transform;

    /**
     * <p>备注信息，没有可以为空</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FmtValue")
    private String fmtValue;

    /**
     * <p>字段类型，不能为空</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
