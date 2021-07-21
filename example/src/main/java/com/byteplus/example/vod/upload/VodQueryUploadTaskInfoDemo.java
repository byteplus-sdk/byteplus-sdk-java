package com.byteplus.example.vod.upload;

import com.byteplus.service.vod.IVodService;
import com.byteplus.service.vod.impl.VodServiceImpl;
import com.byteplus.service.vod.model.request.VodQueryUploadTaskInfoRequest;
import com.byteplus.service.vod.model.response.VodQueryUploadTaskInfoResponse;

import java.util.Arrays;
import java.util.List;

public class VodQueryUploadTaskInfoDemo {

    public static void main(String[] args) {
        IVodService vodService = VodServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.byteplus/config
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        String jobId = "url jobId";
        List<String> jobIds = Arrays.asList(jobId);

        VodQueryUploadTaskInfoRequest vodQueryUploadTaskInfoRequest = VodQueryUploadTaskInfoRequest.newBuilder()
                .setJobIds(String.join(",", jobIds))
                .build();

        try {
            VodQueryUploadTaskInfoResponse vodQueryUploadTaskInfoResponse = vodService.queryUploadTaskInfo(vodQueryUploadTaskInfoRequest);
            if (vodQueryUploadTaskInfoResponse.getResponseMetadata().hasError()) {
                System.out.println(vodQueryUploadTaskInfoResponse.getResponseMetadata().getError());
                System.exit(-1);
            }
            System.out.println(vodQueryUploadTaskInfoResponse.toString());
            System.out.println(vodQueryUploadTaskInfoResponse.getResult().getData().getMediaInfoList(0).getState());
            System.out.println(vodQueryUploadTaskInfoResponse.getResponseMetadata().getRequestId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
