package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListVodPullDomainResResult
 */
@lombok.Data
public final class ListVodPullDomainResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "List")
    private List<String> list;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
