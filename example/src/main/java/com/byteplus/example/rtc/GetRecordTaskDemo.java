package com.byteplus.example.rtc;

import com.alibaba.fastjson.JSON;
import com.byteplus.example.rtc.impl.RtcServiceImpl;
import com.byteplus.example.rtc.model.GetRecordTaskRequest;
import com.byteplus.example.rtc.model.GetRecordTaskResponse;

public class GetRecordTaskDemo {
    public static void main(String[] args) {
        RtcService rtcService = RtcServiceImpl.getInstance();

        rtcService.setAccessKey("ak");
        rtcService.setSecretKey("sk==");

        try {
            GetRecordTaskRequest getRecordTaskRequest = new GetRecordTaskRequest();
            getRecordTaskRequest.setAppId("Your_AppId");
            getRecordTaskRequest.setRoomId("Your_RoomId");
            getRecordTaskRequest.setTaskId("Your_TaskId");
            GetRecordTaskResponse getRecordTaskResponse = rtcService.getRecordTask(getRecordTaskRequest);
            System.out.println(JSON.toJSONString(getRecordTaskResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
