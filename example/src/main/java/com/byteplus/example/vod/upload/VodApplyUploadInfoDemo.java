package com.byteplus.example.vod.upload;

import com.byteplus.service.vod.IVodService;
import com.byteplus.service.vod.impl.VodServiceImpl;
import com.byteplus.service.vod.model.request.VodApplyUploadInfoRequest;
import com.byteplus.service.vod.model.response.VodApplyUploadInfoResponse;

public class VodApplyUploadInfoDemo {

    public static void main(String[] args) {
        IVodService vodService = VodServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        String space = "james-test";

        VodApplyUploadInfoRequest vodApplyUploadInfoRequest = VodApplyUploadInfoRequest.newBuilder()
                .setSpaceName(space)
                .build();

        try {
            VodApplyUploadInfoResponse vodApplyUploadInfoResponse = vodService.applyUploadInfo(vodApplyUploadInfoRequest);
            if (vodApplyUploadInfoResponse.getResponseMetadata().hasError()) {
                System.out.println(vodApplyUploadInfoResponse.getResponseMetadata().getError());
                System.exit(-1);
            }
            System.out.println(vodApplyUploadInfoResponse.toString());
            System.out.println(vodApplyUploadInfoResponse.getResult().getData().getUploadAddress().getSessionKey());
            System.out.println(vodApplyUploadInfoResponse.getResponseMetadata().getRequestId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
