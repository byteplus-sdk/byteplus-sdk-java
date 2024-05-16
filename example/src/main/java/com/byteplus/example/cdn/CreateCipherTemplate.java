package com.byteplus.example.cdn;

import com.alibaba.fastjson.JSON;
import com.byteplus.model.beans.CDN;
import com.byteplus.service.cdn.CDNService;
import com.byteplus.service.cdn.impl.CDNServiceImpl;


public class CreateCipherTemplate {
    public static void main(String[] args) {
        CDNService service = CDNServiceImpl.getInstance();
        service.setAccessKey(Utils.ak);
        service.setSecretKey(Utils.sk);
        try {
            CDN.CreateCipherTemplateRequest req = new CDN.CreateCipherTemplateRequest()
                    .setTitle("example")
                    .setMessage("example")
                    .setProject("default")
                    .setQuic(new CDN.Quic()
                            .setSwitch(false));
            CDN.CreateCipherTemplateResponse resp = service.createCipherTemplate(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
