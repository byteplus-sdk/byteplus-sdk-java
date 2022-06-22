package com.byteplus.service.sms;

import com.byteplus.model.request.*;
import com.byteplus.model.response.ConversionResponse;
import com.byteplus.model.response.SmsCheckVerifyCodeResponse;
import com.byteplus.model.response.SmsSendResponse;
import com.byteplus.service.IBaseService;

public interface SmsService extends IBaseService {
    /**
     * SmsSend.
     *
     * @param smsSendRequest the list users request
     * @return the list users response
     * @throws Exception the exception
     */
    SmsSendResponse send(SmsSendRequest smsSendRequest) throws Exception;

    /**
     * SmsBatchSend.
     *
     * @param smsBatchSendRequest the list users request
     * @return the list users response
     * @throws Exception the exception
     */
    SmsSendResponse batchSend(SmsBatchSendRequest smsBatchSendRequest) throws Exception;

    /**
     * SmsSendVerifyCode.
     *
     * @param smsSendVerifyCodeRequest the list users request
     * @return the list users response
     * @throws Exception the exception
     */
    SmsSendResponse sendVerifyCode(SmsSendVerifyCodeRequest smsSendVerifyCodeRequest) throws Exception;

    /**
     * SmsCheckVerifyCode.
     *
     * @param smsCheckVerifyCodeRequest the list users request
     * @return the list users response
     * @throws Exception the exception
     */
    SmsCheckVerifyCodeResponse checkVerifyCode(SmsCheckVerifyCodeRequest smsCheckVerifyCodeRequest) throws Exception;

    /**
     * Conversion
     * @param conversionRequest
     * @return
     * @throws Exception
     */
    ConversionResponse conversion(ConversionRequest conversionRequest) throws Exception;
}
