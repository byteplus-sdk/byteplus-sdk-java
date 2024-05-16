package com.byteplus.example.cdn;

import com.alibaba.fastjson.JSON;
import com.byteplus.model.beans.CDN;
import com.byteplus.service.cdn.CDNService;
import com.byteplus.service.cdn.impl.CDNServiceImpl;


public class DuplicateTemplate {
    public static void main(String[] args) {
        CDNService service = CDNServiceImpl.getInstance();
        service.setAccessKey(Utils.ak);
        service.setSecretKey(Utils.sk);
        try {
            CDN.DuplicateTemplateRequest req = new CDN.DuplicateTemplateRequest()
                    .setReferredTemplateId("tpl-example")
                    .setTitle("example")
                    .setMessage("example")
                    .setProject("default");
            CDN.DuplicateTemplateResponse resp = service.duplicateTemplate(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
