package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateHeaderConfigBody
 */
@lombok.Data
public final class UpdateHeaderConfigBody  {

    /**
     * <p>域名空间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>应用名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>头部类型，已经废弃</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HeaderType")
    private String headerType;

    /**
     * <p>json配置，使用json更新时填写</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Config")
    private String config;

    /**
     * <p>具体的header配置，目前生效</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HeaderConfigListV2")
    private List<UpdateHeaderConfigBodyHeaderConfigListV2Item> headerConfigListV2;

    /**
     * <p>具体的header映射值，已经废弃</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HeaderDetailList")
    private List<UpdateHeaderConfigBodyHeaderDetailListItem> headerDetailList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
