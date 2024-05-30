package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListVhostDomainDetailByUserIDResResult
 */
@lombok.Data
public final class ListVhostDomainDetailByUserIDResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VhostList")
    private List<ListVhostDomainDetailByUserIDResResultVhostListItem> vhostList;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<ListVhostDomainDetailByUserIDResResultDomainListItem> domainList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
