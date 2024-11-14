package com.byteplus.example.vod.drm;

import com.byteplus.service.vod.IVodService;
import com.byteplus.service.vod.impl.VodServiceImpl;

public class VodGetFairPlayCertUrlDemo {

    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();

        String certId = "your cert id";

        // call below method if you dont set ak and sk in ～/.byteplus/config
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        try {
            String resp = vodService.getFairPlayCertUrl(certId, 3600000L);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
