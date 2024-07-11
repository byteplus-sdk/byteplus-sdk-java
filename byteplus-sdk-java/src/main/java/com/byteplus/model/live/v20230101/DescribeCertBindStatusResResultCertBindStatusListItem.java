package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeCertBindStatusResResultCertBindStatusListItem
 */
@lombok.Data
public final class DescribeCertBindStatusResResultCertBindStatusListItem  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ChainID")
    private String chainID;

    /**
     * <p>和此证书链绑定的域名列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MatchDomainList")
    private List<DescribeCertBindStatusResResultCertBindStatusListItemMatchDomainListItem> matchDomainList;

    /**
     * <p>和此证书链匹配但还未绑定的域名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NotBindDomainList")
    private List<DescribeCertBindStatusResResultCertBindStatusListItemNotBindDomainListItem> notBindDomainList;

    /**
     * <p>和此证书链匹配，且绑定了其他证书的域名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OtherDomainList")
    private List<DescribeCertBindStatusResResultCertBindStatusListItemOtherDomainListItem> otherDomainList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
