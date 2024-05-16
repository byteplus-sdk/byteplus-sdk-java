package com.byteplus.example.cdn;

import com.alibaba.fastjson.JSON;
import com.byteplus.model.beans.CDN;
import com.byteplus.service.cdn.CDNService;
import com.byteplus.service.cdn.impl.CDNServiceImpl;


public class AddTemplateDomain {
    public static void main(String[] args) {
        CDNService service = CDNServiceImpl.getInstance();
        service.setAccessKey(Utils.ak);
        service.setSecretKey(Utils.sk);
        try {
            CDN.AddTemplateDomainRequest req = new CDN.AddTemplateDomainRequest()
                    .setServiceRegion("global")
                    .setProject("default")
                    .setServiceTemplateId("tpl-example")
                    .setCertId("cert-example")
                    .setCipherTemplateId("tpl-example")
                    .setDomain("example.com")
                    .setHTTPSSwitch("on");
            CDN.AddTemplateDomainResponse resp = service.addTemplateDomain(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
