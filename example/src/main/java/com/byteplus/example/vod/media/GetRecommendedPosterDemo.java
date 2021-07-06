package com.byteplus.example.vod.media;

import com.byteplus.service.vod.IVodService;
import com.byteplus.service.vod.impl.VodServiceImpl;
import com.byteplus.service.vod.model.request.VodGetRecommendedPosterRequest;
import com.byteplus.service.vod.model.response.VodGetRecommendedPosterResponse;

public class GetRecommendedPosterDemo {
    public static void main(String[] args) {
        IVodService vodService = VodServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        // vodService.setAccessKey("");
        // vodService.setSecretKey("");

        String vids = "vid1,vid2,vid3";

        try {
            VodGetRecommendedPosterRequest.Builder req = VodGetRecommendedPosterRequest.newBuilder();
            req.setVids(vids);

            VodGetRecommendedPosterResponse resp = vodService.getRecommendedPoster(req.build());
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
