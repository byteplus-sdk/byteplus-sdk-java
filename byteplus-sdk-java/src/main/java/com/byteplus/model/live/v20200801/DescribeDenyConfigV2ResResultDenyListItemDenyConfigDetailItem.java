package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeDenyConfigV2ResResultDenyListItemDenyConfigDetailItem
 */
@lombok.Data
public final class DescribeDenyConfigV2ResResultDenyListItemDenyConfigDetailItem  {

    /**
     * <p>限制类型。</p>
     *
     *
     *
     * <p>- allow：IP 白名单；</p>
     *
     * <p>- deny：IP 黑名单。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>传输协议</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProType")
    private List<String> proType;

    /**
     * <p>拉流类型</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FmtType")
    private List<String> fmtType;

    /**
     * <p>streams名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Streams")
    private List<String> streams;

    /**
     * <p>国家限制，国家码</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Country")
    private List<String> country;

    /**
     * <p>大区限制</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Region")
    private List<String> region;

    /**
     * <p>省份限制</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Province")
    private List<String> province;

    /**
     * <p>城市限制</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "City")
    private List<String> city;

    /**
     * <p>运营商限制</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ISP")
    private List<String> iSP;

    /**
     * <p>黑/白名单 IP 列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IPList")
    private List<String> iPList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
