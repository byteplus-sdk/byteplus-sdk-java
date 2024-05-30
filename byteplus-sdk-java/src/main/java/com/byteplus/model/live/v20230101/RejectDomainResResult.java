package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * RejectDomainResResult
 */
@lombok.Data
public final class RejectDomainResResult  {

    /**
     * <p>VKE VMP 工作空间记录列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VkeVMPWorkspaceRecordList")
    private List<Object> vkeVMPWorkspaceRecordList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
