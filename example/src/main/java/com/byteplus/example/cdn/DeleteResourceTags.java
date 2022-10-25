package com.byteplus.example.cdn;

import com.alibaba.fastjson.JSON;
import com.byteplus.model.beans.CDN;
import com.byteplus.service.cdn.CDNService;
import com.byteplus.service.cdn.impl.CDNServiceImpl;

public class DeleteResourceTags {
    public static void main(String[] args) {
        CDNService service = CDNServiceImpl.getInstance();
        service.setAccessKey(Utils.ak);
        service.setSecretKey(Utils.sk);
        try {
            CDN.DeleteResourceTagsRequest req = new CDN.DeleteResourceTagsRequest()
            .setResources(Arrays.asList("www.example.com", "www.example2.com"))
            .setResourceTags(Arrays.asList(new CDN.ResourceTag().setKey("userKey").setValue("userValue")));

            CDN.DeleteResourceTagsResponse resp = service.deleteResourceTags(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
