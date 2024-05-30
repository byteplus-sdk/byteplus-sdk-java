package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListInstanceBody
 */
@lombok.Data
public final class ListInstanceBody  {

    /**
     * <p>最大100</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private Integer pageSize;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageNum")
    private Integer pageNum;

    /**
     * <p>以,分割</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private String status;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
