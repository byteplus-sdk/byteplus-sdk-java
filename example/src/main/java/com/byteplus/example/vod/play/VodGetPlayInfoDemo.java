package com.byteplus.example.vod.play;

import com.byteplus.service.vod.IVodService;
import com.byteplus.service.vod.impl.VodServiceImpl;
import com.byteplus.service.vod.model.request.VodGetPlayInfoRequest;
import com.byteplus.service.vod.model.response.VodGetPlayInfoResponse;

public class VodGetPlayInfoDemo {

    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();

        String vid = "your vid";

        // call below method if you dont set ak and sk in ～/.byteplus/config
        // vodService.setAccessKey("");
        // vodService.setSecretKey("");

        try {
            VodGetPlayInfoRequest.Builder reqBuilder = VodGetPlayInfoRequest.newBuilder();
            reqBuilder.setVid(vid);
            reqBuilder.setSsl("1");

            VodGetPlayInfoResponse resp = vodService.getPlayInfo(reqBuilder.build());
            if (resp.getResponseMetadata().hasError()) {
                System.out.println(resp.getResponseMetadata().getError());
                System.exit(-1);
            }
            System.out.println(resp.getResult().getPlayInfoList(0).getMainPlayUrl());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
