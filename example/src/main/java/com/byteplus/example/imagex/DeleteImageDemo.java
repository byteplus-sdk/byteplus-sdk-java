package com.byteplus.example.imagex;

import com.byteplus.model.request.DeleteImageReq;
import com.byteplus.model.response.DeleteImageResp;
import com.byteplus.service.imagex.IImageXService;
import com.byteplus.service.imagex.impl.ImageXServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class DeleteImageDemo {
    public static void main(String[] args) {
        // default region cn-north-1, for other region, call ImageXServiceImpl.getInstance(region)
        IImageXService service = ImageXServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.volc/config
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        List<String> uris = new ArrayList<>();
        uris.add("image uri 1");
        uris.add("image uri 2");
        DeleteImageReq req = new DeleteImageReq();
        req.setServiceId("imagex service id");
        req.setStoreUris(uris);

        try {
            DeleteImageResp resp = service.deleteImages(req);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
