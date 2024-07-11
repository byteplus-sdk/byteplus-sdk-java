package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListVhostDetailBody
 */
@lombok.Data
public final class ListVhostDetailBody  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AccountIDList")
    private List<String> accountIDList;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainRegionList")
    private List<String> domainRegionList;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainStatusList")
    private List<Integer> domainStatusList;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainTypeList")
    private List<String> domainTypeList;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageNum")
    private Integer pageNum;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private Integer pageSize;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VhostNameList")
    private List<String> vhostNameList;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VhostStatusList")
    private List<Integer> vhostStatusList;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VhostTypeList")
    private List<String> vhostTypeList;

    /**
     * <p>故障域列表，不填会返回所有的故障域。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FRegionList")
    private List<String> fRegionList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
