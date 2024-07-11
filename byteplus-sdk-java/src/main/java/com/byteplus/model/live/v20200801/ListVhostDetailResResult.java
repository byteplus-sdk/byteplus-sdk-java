package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListVhostDetailResResult
 */
@lombok.Data
public final class ListVhostDetailResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Total")
    private Integer total;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VhostList")
    private List<ListVhostDetailResResultVhostListItem> vhostList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
