package com.byteplus.example.cdn;

import com.alibaba.fastjson.JSON;
import com.byteplus.model.beans.CDN;
import com.byteplus.service.cdn.CDNService;
import com.byteplus.service.cdn.impl.CDNServiceImpl;


public class DescribeTemplateDomains {
    public static void main(String[] args) {
        CDNService service = CDNServiceImpl.getInstance();
        service.setAccessKey(Utils.ak);
        service.setSecretKey(Utils.sk);
        try {
            CDN.DescribeTemplateDomainsRequest req = new CDN.DescribeTemplateDomainsRequest()
                    .setPageNum(1L)
                    .setPageSize(10L);
            CDN.DescribeTemplateDomainsResponse resp = service.describeTemplateDomains(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
