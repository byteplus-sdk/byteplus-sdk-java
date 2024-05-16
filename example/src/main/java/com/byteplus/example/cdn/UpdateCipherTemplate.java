package com.byteplus.example.cdn;

import com.alibaba.fastjson.JSON;
import com.byteplus.model.beans.CDN;
import com.byteplus.service.cdn.CDNService;
import com.byteplus.service.cdn.impl.CDNServiceImpl;

import java.util.Arrays;

public class UpdateCipherTemplate {
    public static void main(String[] args) {
        CDNService service = CDNServiceImpl.getInstance();
        service.setAccessKey(Utils.ak);
        service.setSecretKey(Utils.sk);
        try {
            CDN.UpdateCipherTemplateRequest req = new CDN.UpdateCipherTemplateRequest()
                    .setTitle("example")
                    .setMessage("example")
                    .setQuic(new CDN.Quic()
                            .setSwitch(false))
                    .setHTTPS(new CDN.HTTPSCommon()
                            .setHTTP2(false)
                            .setOCSP(false)
                            .setTlsVersion(Arrays.asList("tlsv1.1", "tlsv1.2", "tlsv1.3"))
                            .setHsts(new CDN.Hsts()
                                    .setSwitch(true)
                                    .setTtl(0L)
                                    .setSubdomain("exclude"))
                            .setForcedRedirect(new CDN.ForcedRedirect()
                                    .setEnableForcedRedirect(false)
                                    .setStatusCode("")))
                    .setHttpForcedRedirect(new CDN.HttpForcedRedirect()
                            .setEnableForcedRedirect(false)
                            .setStatusCode(""))
                    .setTemplateId("tpl-example");
            CDN.UpdateCipherTemplateResponse resp = service.updateCipherTemplate(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
