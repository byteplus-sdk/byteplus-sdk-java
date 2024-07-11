package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * ListStorageSpaceBody
 */
@lombok.Data
public final class ListStorageSpaceBody  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private Integer pageSize;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageNum")
    private Integer pageNum;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
