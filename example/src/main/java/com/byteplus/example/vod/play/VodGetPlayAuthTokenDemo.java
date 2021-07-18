package com.byteplus.example.vod.play;

import com.byteplus.service.vod.IVodService;
import com.byteplus.service.vod.impl.VodServiceImpl;
import com.byteplus.service.vod.model.request.VodGetPlayInfoRequest;

public class VodGetPlayAuthTokenDemo {

    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();

        String vid = "v1100eg50000c3lsps3c77u0p39a9oag";

        // call below method if you dont set ak and sk in ～/.vcloud/config
         vodService.setAccessKey("AKAPOWMzYjM4MjQwNzAwNGQwMWJiMTVmNzlmNjJjNGZkNjY");
         vodService.setSecretKey("TkRNeU0yRm1OalZsTURNeU5HSmxaV0k1WkRnNU9XRTBOMlJrTURaaFlUVQ==");

        try {
            VodGetPlayInfoRequest.Builder reqBuilder = VodGetPlayInfoRequest.newBuilder();
            reqBuilder.setVid(vid);

            String resp = vodService.getPlayAuthToken(reqBuilder.build(), 3600000L);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
