package com.byteplus.example.rtc;


import com.byteplus.example.rtc.model.*;
import com.byteplus.service.IBaseService;


/**
 * The interface rtc service.
 */
public interface RtcService extends IBaseService {
    StartRecordResponse startRecord(StartRecordRequest startRecordRequest) throws Exception;

    GetRecordTaskResponse getRecordTask(GetRecordTaskRequest getRecordTaskRequest) throws Exception;
}
