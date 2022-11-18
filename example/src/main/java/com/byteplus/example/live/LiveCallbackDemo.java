package com.byteplus.example.live;

import com.alibaba.fastjson.JSON;
import com.byteplus.model.live.CallbackDetail;
import com.byteplus.model.live.request.DeleteCallbackRequest;
import com.byteplus.model.live.request.DescribeCallbackRequest;
import com.byteplus.model.live.request.UpdateCallbackRequest;
import com.byteplus.model.live.response.DeleteCallbackRespose;
import com.byteplus.model.live.response.DescribeCallbackResponse;
import com.byteplus.model.live.response.UpdateCallbackResponse;
import com.byteplus.service.live.LiveService;
import com.byteplus.service.live.impl.LiveServiceImpl;

/**
 * 与Callback相关的demo
 */
public class LiveCallbackDemo {

    public static void main(String[] args) {
        LiveService liveService = LiveServiceImpl.getInstance();
        liveService.setAccessKey("your accessKey");
        liveService.setSecretKey("your secretKey");
        //更新
        updateCallbackDemo(liveService);
        //查询
        describeCallbackDemo(liveService);
        //删除
        deleteCallbackDemo(liveService);
    }


    /**
     * 更新
     *
     * @param liveService
     */
    private static void updateCallbackDemo(LiveService liveService) {
        UpdateCallbackRequest request = new UpdateCallbackRequest();
        request.setMessageType("record");
        request.setDomain("domain");
        request.setVhost("vhost");
        CallbackDetail callbackDetail = new CallbackDetail();
        callbackDetail.setCallbackType("");
        callbackDetail.setURL("");
        request.setCallbackDetailList(new CallbackDetail[]{callbackDetail});
        try {
            UpdateCallbackResponse response = liveService.updateCallback(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * 查询
     *
     * @param liveService
     */
    private static void describeCallbackDemo(LiveService liveService) {
        DescribeCallbackRequest request = new DescribeCallbackRequest();
        request.setMessageType("");
        request.setDomain("");
        request.setApp("");
        try {
            DescribeCallbackResponse response = liveService.describeCallback(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 删除
     *
     * @param liveService
     */
    private static void deleteCallbackDemo(LiveService liveService) {
        DeleteCallbackRequest request = new DeleteCallbackRequest();
        request.setMessageType("record");
        request.setVhost("vhost");
        try {
            DeleteCallbackRespose response = liveService.deleteCallback(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
