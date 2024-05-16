package com.byteplus.example.cdn;

import com.alibaba.fastjson.JSON;
import com.byteplus.model.beans.CDN;
import com.byteplus.service.cdn.CDNService;
import com.byteplus.service.cdn.impl.CDNServiceImpl;

import java.util.Collections;

public class UpdateTemplateDomain {
    public static void main(String[] args) {
        CDNService service = CDNServiceImpl.getInstance();
        service.setAccessKey(Utils.ak);
        service.setSecretKey(Utils.sk);
        try {
            CDN.UpdateTemplateDomainRequest req = new CDN.UpdateTemplateDomainRequest()
                    .setServiceRegion("global")
                    .setServiceTemplateId("tpl-example")
                    .setCertId("cert-example")
                    .setCipherTemplateId("tpl-example")
                    .setHTTPSSwitch("on")
                    .setDomains(Collections.singletonList("example.com"));
            CDN.UpdateTemplateDomainResponse resp = service.updateTemplateDomain(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
