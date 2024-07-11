package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListISPsResResult
 */
@lombok.Data
public final class ListISPsResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ISPList")
    private List<ListISPsResResultISPListItem> iSPList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
