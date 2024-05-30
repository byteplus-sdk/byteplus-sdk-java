package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeDenyConfigResResultDenyListItemDenyConfigItem
 */
@lombok.Data
public final class DescribeDenyConfigResResultDenyListItemDenyConfigItem  {

    /**
     * <p>协议类型，比如 TCP、KCP、QUIC。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProType")
    private List<String> proType;

    /**
     * <p>格式类型，比如 HTTP、RTMP。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FmtType")
    private List<String> fmtType;

    /**
     * <p>大洲</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Continent")
    private String continent;

    /**
     * <p>国家码</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Country")
    private String country;

    /**
     * <p>区域</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Region")
    private String region;

    /**
     * <p>城市</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "City")
    private String city;

    /**
     * <p>运营商。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ISP")
    private String iSP;

    /**
     * <p>黑名单。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DenyList")
    private List<String> denyList;

    /**
     * <p>白名单。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AllowList")
    private List<String> allowList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
