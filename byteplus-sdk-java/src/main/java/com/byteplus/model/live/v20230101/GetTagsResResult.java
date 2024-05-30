package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetTagsResResult
 */
@lombok.Data
public final class GetTagsResResult  {

    /**
     * <p>标签列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Tags")
    private List<GetTagsResResultTagsItem> tags;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
