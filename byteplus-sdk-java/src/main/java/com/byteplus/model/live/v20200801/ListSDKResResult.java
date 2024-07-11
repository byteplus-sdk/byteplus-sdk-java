package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListSDKResResult
 */
@lombok.Data
public final class ListSDKResResult  {

    /**
     * <p>sdk总记录数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Total")
    private Integer total;

    /**
     * <p>sdk详情列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "List")
    private List<ListSDKResResultListItem> list;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
