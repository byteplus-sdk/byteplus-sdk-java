package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * ListISPsResISPListItem
 */
@lombok.Data
public final class ListISPsResISPListItem  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Code")
    private String code;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
