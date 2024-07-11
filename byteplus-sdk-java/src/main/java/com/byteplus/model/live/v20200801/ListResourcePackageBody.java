package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * ListResourcePackageBody
 */
@lombok.Data
public final class ListResourcePackageBody  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NeedFilter")
    private Integer needFilter;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageNum")
    private Integer pageNum;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private Integer pageSize;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private Integer status;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
