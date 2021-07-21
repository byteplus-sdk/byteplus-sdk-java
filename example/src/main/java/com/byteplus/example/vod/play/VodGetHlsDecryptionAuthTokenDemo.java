package com.byteplus.example.vod.play;

import com.byteplus.service.vod.IVodService;
import com.byteplus.service.vod.impl.VodServiceImpl;

public class VodGetHlsDecryptionAuthTokenDemo {

    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.byteplus/config
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        try {
            String resp = vodService.createSha1HlsDrmAuthToken(3600L);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
