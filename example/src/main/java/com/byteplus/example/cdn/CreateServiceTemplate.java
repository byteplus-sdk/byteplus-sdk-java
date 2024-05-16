package com.byteplus.example.cdn;

import com.alibaba.fastjson.JSON;
import com.byteplus.model.beans.CDN;
import com.byteplus.service.cdn.CDNService;
import com.byteplus.service.cdn.impl.CDNServiceImpl;

import java.util.Collections;

public class CreateServiceTemplate {
    public static void main(String[] args) {
        CDNService service = CDNServiceImpl.getInstance();
        service.setAccessKey(Utils.ak);
        service.setSecretKey(Utils.sk);
        try {
            CDN.CreateServiceTemplateRequest req = new CDN.CreateServiceTemplateRequest()
                    .setTitle("example")
                    .setMessage("example")
                    .setProject("default")
                    .setOriginProtocol("http")
                    .setOriginHost("")
                    .setOrigin(Collections.singletonList(new CDN.OriginRule()
                            .setOriginAction(new CDN.OriginAction()
                                    .setOriginLines(Collections.singletonList(new CDN.OriginLine()
                                            .setOriginType("primary")
                                            .setInstanceType("domain")
                                            .setAddress("example.com")
                                            .setWeight("1")
                                            .setHttpPort("80")
                                            .setHttpsPort("443")
                                            .setOriginHost("")
                                    ))
                            )
                    ));
            CDN.CreateServiceTemplateResponse resp = service.createServiceTemplate(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
