package com.byteplus.example.vod.drm;

import com.byteplus.service.vod.IVodService;
import com.byteplus.service.vod.impl.VodServiceImpl;
import com.byteplus.service.vod.model.request.VodGetDrmLicenseRequest;

public class VodGetThirdPartyDrmAuthTokenDemo {

    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();

        String vid = "your vid";
        String thirdPartyDrmType = "your drmType"; // widevine or fairplay

        // call below method if you dont set ak and sk in ～/.byteplus/config
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        try {
            VodGetDrmLicenseRequest.Builder reqBuilder = VodGetDrmLicenseRequest.newBuilder();
            reqBuilder.setVid(vid);
            reqBuilder.setThirdPartyDrmType(thirdPartyDrmType);

            String resp = vodService.getThirdPartyDrmAuthToken(reqBuilder.build(), 3600000L);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
