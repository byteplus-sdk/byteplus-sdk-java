package com.byteplus.example.cdn;

import com.alibaba.fastjson.JSON;
import com.byteplus.model.beans.CDN;
import com.byteplus.service.cdn.CDNService;
import com.byteplus.service.cdn.impl.CDNServiceImpl;

public class ReleaseTemplate {
    public static void main(String[] args) {
        CDNService service = CDNServiceImpl.getInstance();
        service.setAccessKey(Utils.ak);
        service.setSecretKey(Utils.sk);
        try {
            CDN.ReleaseTemplateRequest req = new CDN.ReleaseTemplateRequest()
                    .setEnv("prod")
                    .setMessage("test")
                    .setTemplateId("tpl-xxxxxxx")
                    .setTemplateVersion("draft");
            CDN.ReleaseTemplateResponse resp = service.releaseTemplate(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
