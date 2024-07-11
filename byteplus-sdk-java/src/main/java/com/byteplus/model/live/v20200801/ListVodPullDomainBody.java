package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * ListVodPullDomainBody
 */
@lombok.Data
public final class ListVodPullDomainBody  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VodNamespace")
    private String vodNamespace;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
