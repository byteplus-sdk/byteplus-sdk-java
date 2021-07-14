package com.byteplus.example.vod.subtitle;

import com.google.protobuf.StringValue;
import com.byteplus.service.vod.IVodService;
import com.byteplus.service.vod.impl.VodServiceImpl;
import com.byteplus.service.vod.model.request.VodUpdateSubtitleInfoRequest;
import com.byteplus.service.vod.model.response.VodUpdateSubtitleInfoResponse;

public class UpdateSubtitleInfoDemo {
    public static void main(String[] args) {
        IVodService vodService = VodServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        // vodService.setAccessKey("");
        // vodService.setSecretKey("");

        String vid = "vid";
        String fileId = "fileId";
        String format = "format";
        String language = "language";
        String title = "title";
        String tag = "tag";

        try {
            VodUpdateSubtitleInfoRequest.Builder req = VodUpdateSubtitleInfoRequest.newBuilder();
            req.setVid(vid);
            req.setFileId(fileId);
            req.setFormat(format);
            req.setLanguage(language);
            req.setTitle(StringValue.of(title));
            req.setTag(StringValue.of(tag));

            VodUpdateSubtitleInfoResponse resp = vodService.updateSubtitleInfo(req.build());
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
