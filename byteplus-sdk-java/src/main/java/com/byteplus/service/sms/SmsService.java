package com.byteplus.service.sms;

import com.byteplus.model.request.*;
import com.byteplus.model.response.*;
import com.byteplus.service.IBaseService;
import org.apache.http.NameValuePair;

import java.util.List;

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
     *
     * @param conversionRequest
     * @return
     * @throws Exception
     */
    ConversionResponse conversion(ConversionRequest conversionRequest) throws Exception;

    /**
     * GetSubAccountList
     *
     * @param getSubAccountListRequest
     * @return
     * @throws Exception
     */
    GetSubAccountListResponse getSubAccountList(GetSubAccountListRequest getSubAccountListRequest) throws Exception;

    /**
     * GetSubAccountDetail
     *
     * @param subAccountRequest
     * @return
     * @throws Exception
     */
    GetSubAccountDetailResponse getSubAccountDetail(SubAccountRequest subAccountRequest) throws Exception;

    /**
     * GetSmsTemplateAndOrderList
     *
     * @param getSmsTemplateAndOrderListRequest
     * @return
     * @throws Exception
     */
    GetSmsTemplateAndOrderListResponse getSmsTemplateAndOrderList(GetSmsTemplateAndOrderListRequest getSmsTemplateAndOrderListRequest) throws Exception;

    /**
     * ApplySmsTemplate
     *
     * @param applySmsTemplateRequest
     * @return
     * @throws Exception
     */
    ApplySmsTemplateResponse applySmsTemplate(ApplySmsTemplateRequest applySmsTemplateRequest) throws Exception;

    /**
     * DeleteSmsTemplate
     *
     * @param deleteSmsTemplateRequest
     * @return
     * @throws Exception
     */
    DeleteSmsTemplateResponse deleteSmsTemplate(DeleteSmsTemplateRequest deleteSmsTemplateRequest) throws Exception;
}
