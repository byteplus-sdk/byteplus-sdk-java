package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListAllStreamStateResResult
 */
@lombok.Data
public final class ListAllStreamStateResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "List")
    private List<ListAllStreamStateResResultListItem> list;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
