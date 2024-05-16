package com.byteplus.example.cdn;

import com.alibaba.fastjson.JSON;
import com.byteplus.model.beans.CDN;
import com.byteplus.service.cdn.CDNService;
import com.byteplus.service.cdn.impl.CDNServiceImpl;

import java.util.Collections;

public class UpdateServiceTemplate {
    public static void main(String[] args) {
        CDNService service = CDNServiceImpl.getInstance();
        service.setAccessKey(Utils.ak);
        service.setSecretKey(Utils.sk);
        try {
            CDN.UpdateServiceTemplateRequest req = new CDN.UpdateServiceTemplateRequest()
                    .setTitle("example")
                    .setMessage("example")
                    .setOriginProtocol("http")
                    .setOriginHost("")
                    .setOrigin(Collections.singletonList(new CDN.OriginRule()
                            .setOriginAction(new CDN.OriginAction()
                                    .setOriginLines(Collections.singletonList(new CDN.OriginLine()
                                            .setAddress("example.com")
                                            .setHttpPort("80")
                                            .setHttpsPort("443")
                                            .setInstanceType("domain")
                                            .setOriginHost("")
                                            .setOriginType("primary")
                                            .setWeight("1")
                                    ))
                            )
                    ))
                    .setTemplateId("tpl-example");
            CDN.UpdateServiceTemplateResponse resp = service.updateServiceTemplate(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
