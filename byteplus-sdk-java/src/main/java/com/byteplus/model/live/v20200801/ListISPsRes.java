package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListISPsRes
 */
@lombok.Data
public final class ListISPsRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ISPList")
    private List<ListISPsResISPListItem> iSPList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
