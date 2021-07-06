package com.byteplus.example.vod.media;


import com.byteplus.service.vod.IVodService;
import com.byteplus.service.vod.impl.VodServiceImpl;
import com.google.protobuf.StringValue;
import com.byteplus.service.vod.model.request.VodUpdateMediaInfoRequest;
import com.byteplus.service.vod.model.response.VodUpdateMediaInfoResponse;

public class UpdateMediaInfoDemo {
    public static void main(String[] args) {
        IVodService vodService = VodServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        // vodService.setAccessKey("");
        // vodService.setSecretKey("");

        String vid = "vid";
        String Title = "title";
        String Tags = "tag1,tag2";

        try {
            VodUpdateMediaInfoRequest.Builder req = VodUpdateMediaInfoRequest.newBuilder();
            req.setVid(vid);
            req.setTitle(StringValue.of(Title));
            req.setTags(StringValue.of(Tags));

            VodUpdateMediaInfoResponse resp = vodService.updateMediaInfo(req.build());
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
