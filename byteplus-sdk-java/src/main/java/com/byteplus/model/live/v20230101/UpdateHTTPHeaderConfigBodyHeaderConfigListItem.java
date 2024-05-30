package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateHTTPHeaderConfigBodyHeaderConfigListItem
 */
@lombok.Data
public final class UpdateHTTPHeaderConfigBodyHeaderConfigListItem  {

    /**
     * <p>key</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HeaderKey")
    private String headerKey;

    /**
     * <p>value</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HeaderValue")
    private String headerValue;

    /**
     * <p>参数的类型：</p>
     *
     * <p>0：常量变量</p>
     *
     * <p>1：可变参数变量</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HeaderFieldType")
    private Integer headerFieldType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
