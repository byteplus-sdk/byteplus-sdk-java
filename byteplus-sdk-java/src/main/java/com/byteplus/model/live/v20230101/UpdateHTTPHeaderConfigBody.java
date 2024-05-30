package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateHTTPHeaderConfigBody
 */
@lombok.Data
public final class UpdateHTTPHeaderConfigBody  {

    /**
     * <p> 域名空间名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>header的类型：</p>
     *
     * <p>0：请求响应头</p>
     *
     * <p>1：回源请求头</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Phase")
    private Integer phase;

    /**
     * <p>头部具体参数列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HeaderConfigList")
    private List<UpdateHTTPHeaderConfigBodyHeaderConfigListItem> headerConfigList;

    /**
     * <p>是否去掉原头部</p>
     *
     * <p>0：保留原header</p>
     *
     * <p>1：去掉</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BlockOriginal")
    private Integer blockOriginal;

    /**
     * <p>是否启用</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Enable")
    private Boolean enable;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
