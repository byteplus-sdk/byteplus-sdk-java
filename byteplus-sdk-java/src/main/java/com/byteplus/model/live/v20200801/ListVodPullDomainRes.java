package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * ListVodPullDomainRes
 */
@lombok.Data
public final class ListVodPullDomainRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ListVodPullDomainResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ListVodPullDomainResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
