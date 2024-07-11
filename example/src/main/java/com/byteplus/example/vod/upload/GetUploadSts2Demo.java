package com.byteplus.service.vod.impl;

import com.alibaba.fastjson.JSON;
import com.byteplus.model.sts2.SecurityToken2;
import com.byteplus.service.vod.IVodService;
import com.byteplus.service.vod.impl.VodServiceImpl;
import com.byteplus.util.Time;


public class GetUploadSts2Demo {

    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        SecurityToken2 sts2WithExpire = vodService.getUploadSts2WithExpire(Time.Hour);
        System.out.println(JSON.toJSONString(sts2WithExpire));


        SecurityToken2 sts2 = vodService.getUploadSts2WithExpire(Time.Hour);
        System.out.println(JSON.toJSONString(sts2));

    }
}
