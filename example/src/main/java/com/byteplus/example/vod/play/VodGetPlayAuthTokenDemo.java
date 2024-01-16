package com.byteplus.example.vod.play;

import com.byteplus.service.vod.IVodService;
import com.byteplus.service.vod.impl.VodServiceImpl;
import com.byteplus.service.vod.model.request.VodGetPlayInfoRequest;

public class VodGetPlayAuthTokenDemo {

    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();

        String vid = "your vid";

        // call below method if you dont set ak and sk in ～/.byteplus/config
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

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
