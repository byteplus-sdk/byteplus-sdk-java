package com.byteplus.example.imagex;

import com.byteplus.model.request.UpdateImageFilesRequest;
import com.byteplus.model.response.UpdateImageFilesResponse;
import com.byteplus.service.imagex.*;
import com.byteplus.service.imagex.impl.ImageXServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class UpdateImageUrlsDemo {
    public static void main(String[] args) {
        // default region cn-north-1, for other region, call ImageXServiceImpl.getInstance(region)
        IImageXService service = ImageXServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.volc/config
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        List<String> urls = new ArrayList<>();
        urls.add("image url 1");
        urls.add("image url 2");
        UpdateImageFilesRequest req = new UpdateImageFilesRequest();
        req.setServiceId("imagex service id");
        req.setAction(ImageXConfig.ACTION_REFRESH);
        req.setImageUrls(urls);

        try {
            UpdateImageFilesResponse resp = service.updateImageUrls(req);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
