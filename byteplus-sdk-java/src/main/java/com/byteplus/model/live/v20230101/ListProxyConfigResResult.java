package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListProxyConfigResResult
 */
@lombok.Data
public final class ListProxyConfigResResult  {

    /**
     * <p>总共数目</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Total")
    private Integer total;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "List")
    private List<ListProxyConfigResResultListItem> list;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
