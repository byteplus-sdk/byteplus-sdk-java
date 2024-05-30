package com.byteplus.service.live.v20230101;

import com.alibaba.fastjson.annotation.JSONField;
import com.byteplus.helper.Const;
import com.byteplus.helper.Utils;
import com.byteplus.model.ServiceInfo;
import com.byteplus.model.response.RawResponse;
import com.byteplus.model.response.ResponseMetadata;
import com.alibaba.fastjson.JSON;
import com.byteplus.model.live.v20230101.*;
import com.byteplus.service.BaseServiceImpl;
import lombok.Data;
import org.apache.http.HttpHost;

/**
 * Live Trait
 */
public class LiveTrait extends BaseServiceImpl {
    protected LiveTrait() {
        super(LiveConfig.serviceInfoMap.get(Const.REGION_CN_NORTH_1), LiveConfig.apiInfoList);
    }

    protected LiveTrait(ServiceInfo serviceInfo) {
        super(serviceInfo, LiveConfig.apiInfoList);
    }
    
    protected LiveTrait(HttpHost proxy) {
        super(LiveConfig.serviceInfoMap.get(Const.REGION_CN_NORTH_1), proxy, LiveConfig.apiInfoList);
    }

    @Data
    static public class ResponseModel {
        @JSONField(name = "ResponseMetadata")
        private ResponseMetadata responseMetadata;
    }

    private <T> T parseRawResponse(RawResponse rawResponse, Class<T> type) throws Exception {
        Exception ex = (rawResponse.getException());
        if (ex != null) {
            throw ex;
        }
        byte[] data = rawResponse.getData();
        if (data == null) {
            throw new Exception("null response body got, rawResponse:" + JSON.toJSONString(rawResponse));
        }

        ResponseModel resp = JSON.parseObject(data, ResponseModel.class);
        ResponseMetadata responseMetadata = resp.getResponseMetadata();
        if (responseMetadata == null) {
            return JSON.parseObject(data, type);
        }
        ResponseMetadata.Error err = responseMetadata.getError();
        if (err != null) {
            throw new Exception(String.format("API Error: LogID:%s ErrorCode:%s(%d) %s, rawResponse:%s",
                    resp.getResponseMetadata().getRequestId(),
                    err.getCode(), err.getCodeN(),
                    err.getMessage(),
                    JSON.toJSONString(rawResponse)
            ));
        }

        return JSON.parseObject(data, type);
    }


    /**
     * <p>deleteTranscodePreset</p>
     * <p>删除转码配置</p>
     *
     * <p>依据模版名称、域名名称和 `App` 信息，删除指定模板。首先解除 `App` 和模版之间的绑定，再判断若没有其它 `App` 绑定该模版，则安全删除该模版。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteTranscodePresetRes deleteTranscodePreset(DeleteTranscodePresetBody body) throws Exception {
        RawResponse rawResponse = json("DeleteTranscodePreset", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteTranscodePresetRes.class);
    }

    /**
     * <p>deleteCommonTransPreset</p>
     * <p>删除通用转码模板</p>
     *
     * <p>删除通用转码模板</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteCommonTransPresetRes deleteCommonTransPreset(DeleteCommonTransPresetBody body) throws Exception {
        RawResponse rawResponse = json("DeleteCommonTransPreset", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteCommonTransPresetRes.class);
    }

    /**
     * <p>deleteTranscodePresetPatchByAdmin</p>
     * <p>批量删除转码模板</p>
     *
     * <p>批量删除转码模板</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteTranscodePresetPatchByAdminRes deleteTranscodePresetPatchByAdmin(DeleteTranscodePresetPatchByAdminBody body) throws Exception {
        RawResponse rawResponse = json("DeleteTranscodePresetPatchByAdmin", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteTranscodePresetPatchByAdminRes.class);
    }

    /**
     * <p>addCommonTransPreset</p>
     * <p>新增通用转码模板</p>
     *
     * <p>新增通用转码模板</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public AddCommonTransPresetRes addCommonTransPreset(AddCommonTransPresetBody body) throws Exception {
        RawResponse rawResponse = json("AddCommonTransPreset", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, AddCommonTransPresetRes.class);
    }

    /**
     * <p>updateTranscodePreset</p>
     * <p>更新转码配置</p>
     *
     * <p>更新转码模版相关配置，若未填写非必选参数，则转码模板配置不发生改变。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateTranscodePresetRes updateTranscodePreset(UpdateTranscodePresetBody body) throws Exception {
        RawResponse rawResponse = json("UpdateTranscodePreset", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateTranscodePresetRes.class);
    }

    /**
     * <p>listCommonTransPresetDetail</p>
     * <p>查询内置转码档位的详细配置</p>
     *
     * <p>调用该接口查询直播系统内置转码档位的详细配置。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ListCommonTransPresetDetailRes listCommonTransPresetDetail(ListCommonTransPresetDetailBody body) throws Exception {
        RawResponse rawResponse = json("ListCommonTransPresetDetail", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ListCommonTransPresetDetailRes.class);
    }

    /**
     * <p>describeTranscodePresetDetail</p>
     * <p>查询转码模板详情</p>
     *
     * <p>查询转码模板详情</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeTranscodePresetDetailRes describeTranscodePresetDetail(DescribeTranscodePresetDetailBody body) throws Exception {
        RawResponse rawResponse = json("DescribeTranscodePresetDetail", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeTranscodePresetDetailRes.class);
    }

    /**
     * <p>listVhostTransCodePreset</p>
     * <p>查询转码配置列表</p>
     *
     * <p>查询指定域名空间下的全部应用以及与其相关联的转码配置。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ListVhostTransCodePresetRes listVhostTransCodePreset(ListVhostTransCodePresetBody body) throws Exception {
        RawResponse rawResponse = json("ListVhostTransCodePreset", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ListVhostTransCodePresetRes.class);
    }

    /**
     * <p>createTranscodePreset</p>
     * <p>添加转码配置</p>
     *
     * <p>调用接口添加转码模版。新增转码模版会先加入模版库，再绑定到对应的 `App`。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateTranscodePresetRes createTranscodePreset(CreateTranscodePresetBody body) throws Exception {
        RawResponse rawResponse = json("CreateTranscodePreset", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateTranscodePresetRes.class);
    }

    /**
     * <p>createTranscodePresetPatchByAdmin</p>
     * <p>添加转码配置批量接口</p>
     *
     * <p>添加转码配置批量接口，目前只给vadmin使用</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateTranscodePresetPatchByAdminRes createTranscodePresetPatchByAdmin(CreateTranscodePresetPatchByAdminBody body) throws Exception {
        RawResponse rawResponse = json("CreateTranscodePresetPatchByAdmin", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateTranscodePresetPatchByAdminRes.class);
    }

    /**
     * <p>deleteWatermarkPresetV2</p>
     * <p>删除水印V2</p>
     *
     * <p>删除水印V2，给vadmin使用，不会操作关联关系</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteWatermarkPresetV2Res deleteWatermarkPresetV2(DeleteWatermarkPresetV2Body body) throws Exception {
        RawResponse rawResponse = json("DeleteWatermarkPresetV2", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteWatermarkPresetV2Res.class);
    }

    /**
     * <p>updateWatermarkPresetV2</p>
     * <p>更新水印V2</p>
     *
     * <p>更新水印V2，给vadmin使用，不会操作关联关系</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateWatermarkPresetV2Res updateWatermarkPresetV2(UpdateWatermarkPresetV2Body body) throws Exception {
        RawResponse rawResponse = json("UpdateWatermarkPresetV2", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateWatermarkPresetV2Res.class);
    }

    /**
     * <p>describeWatermarkPresetDetail</p>
     * <p>查询水印模板详情</p>
     *
     * <p>查询水印模板详情</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeWatermarkPresetDetailRes describeWatermarkPresetDetail(DescribeWatermarkPresetDetailBody body) throws Exception {
        RawResponse rawResponse = json("DescribeWatermarkPresetDetail", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeWatermarkPresetDetailRes.class);
    }

    /**
     * <p>createWatermarkPreset</p>
     * <p>添加水印</p>
     *
     * <p>为指定的 App 添加水印。支持设置水印图片、位置、尺寸等参数。  </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateWatermarkPresetRes createWatermarkPreset(CreateWatermarkPresetBody body) throws Exception {
        RawResponse rawResponse = json("CreateWatermarkPreset", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateWatermarkPresetRes.class);
    }

    /**
     * <p>createWatermarkPresetV2</p>
     * <p>添加水印v2</p>
     *
     * <p>添加水印v2，给vadmin使用，背后没有做关联</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateWatermarkPresetV2Res createWatermarkPresetV2(CreateWatermarkPresetV2Body body) throws Exception {
        RawResponse rawResponse = json("CreateWatermarkPresetV2", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateWatermarkPresetV2Res.class);
    }

    /**
     * <p>updateWatermarkPreset</p>
     * <p>更新水印</p>
     *
     * <p>修改指定 App 的水印。支持修改水印图片、位置、尺寸等参数。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateWatermarkPresetRes updateWatermarkPreset(UpdateWatermarkPresetBody body) throws Exception {
        RawResponse rawResponse = json("UpdateWatermarkPreset", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateWatermarkPresetRes.class);
    }

    /**
     * <p>deleteWatermarkPreset</p>
     * <p>删除水印</p>
     *
     * <p>删除指定 App 的水印。 </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteWatermarkPresetRes deleteWatermarkPreset(DeleteWatermarkPresetBody body) throws Exception {
        RawResponse rawResponse = json("DeleteWatermarkPreset", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteWatermarkPresetRes.class);
    }

    /**
     * <p>listWatermarkPreset</p>
     * <p>查询水印</p>
     *
     * <p>查询指定 App 的水印信息。 </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ListWatermarkPresetRes listWatermarkPreset(ListWatermarkPresetBody body) throws Exception {
        RawResponse rawResponse = json("ListWatermarkPreset", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ListWatermarkPresetRes.class);
    }

    /**
     * <p>listVhostWatermarkPreset</p>
     * <p>查询水印列表</p>
     *
     * <p>查询视频直播配置空间 `Vhost` 下的水印列表。 </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ListVhostWatermarkPresetRes listVhostWatermarkPreset(ListVhostWatermarkPresetBody body) throws Exception {
        RawResponse rawResponse = json("ListVhostWatermarkPreset", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ListVhostWatermarkPresetRes.class);
    }

    /**
     * <p>stopPullRecordTask</p>
     * <p>停止直播录制任务</p>
     *
     * <p>创建直播录制任务成功后，使用该接口停止任务。  </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public StopPullRecordTaskRes stopPullRecordTask(StopPullRecordTaskBody body) throws Exception {
        RawResponse rawResponse = json("StopPullRecordTask", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, StopPullRecordTaskRes.class);
    }

    /**
     * <p>createPullRecordTask</p>
     * <p>创建直播录制任务</p>
     *
     * <p>本接口支持创建直播录制任务，创建成功后，可以将实时的视频直播流进行录制（Record）并保存为视频文件。  </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreatePullRecordTaskRes createPullRecordTask(CreatePullRecordTaskBody body) throws Exception {
        RawResponse rawResponse = json("CreatePullRecordTask", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreatePullRecordTaskRes.class);
    }

    /**
     * <p>deleteRecordHistory</p>
     * <p>删除录制历史</p>
     *
     * <p>删除录制历史</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteRecordHistoryRes deleteRecordHistory(DeleteRecordHistoryBody body) throws Exception {
        RawResponse rawResponse = json("DeleteRecordHistory", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteRecordHistoryRes.class);
    }

    /**
     * <p>deleteRecordPreset</p>
     * <p>删除录制配置</p>
     *
     * <p>调用接口删除录制配置模版。调用后，首先解除 `App` 和模版之间的绑定，其次判断如果没有其它 `App` 绑定该模版，则会安全删除该录制配置模版。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>删除录制配置不会同步删除相关回调配置。</p>
     *
     * <p>:::</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteRecordPresetRes deleteRecordPreset(DeleteRecordPresetBody body) throws Exception {
        RawResponse rawResponse = json("DeleteRecordPreset", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteRecordPresetRes.class);
    }

    /**
     * <p>updateRecordPresetV2</p>
     * <p>更新录制配置</p>
     *
     * <p>根据域名空间下的应用所关联的录制模版配置更新修改，可调整格式和存储目录等。</p>
     *
     *
     *
     * <p>:::tip </p>
     *
     * <p>如果请求时，未传入非必选参数，则不更改该参数值。</p>
     *
     * <p>:::</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateRecordPresetV2Res updateRecordPresetV2(UpdateRecordPresetV2Body body) throws Exception {
        RawResponse rawResponse = json("UpdateRecordPresetV2", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateRecordPresetV2Res.class);
    }

    /**
     * <p>describeRecordTaskFileHistory</p>
     * <p>查询录制历史详情</p>
     *
     * <p>调用接口查询指定 `Vhost` 下的直播录制历史信息。包括但不限于录制时长、文件格式、开始时间、结束时间。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeRecordTaskFileHistoryRes describeRecordTaskFileHistory(DescribeRecordTaskFileHistoryBody body) throws Exception {
        RawResponse rawResponse = json("DescribeRecordTaskFileHistory", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeRecordTaskFileHistoryRes.class);
    }

    /**
     * <p>listVhostRecordPresetV2</p>
     * <p>查询录制配置列表</p>
     *
     * <p>根据域名下所有的应用名称，查询与各应用关联的录制模板。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ListVhostRecordPresetV2Res listVhostRecordPresetV2(ListVhostRecordPresetV2Body body) throws Exception {
        RawResponse rawResponse = json("ListVhostRecordPresetV2", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ListVhostRecordPresetV2Res.class);
    }

    /**
     * <p>listPullRecordTask</p>
     * <p>查询直播录制任务</p>
     *
     * <p>获取当前账号下，已经创建的直播录制任务列表。  </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ListPullRecordTaskRes listPullRecordTask(ListPullRecordTaskBody body) throws Exception {
        RawResponse rawResponse = json("ListPullRecordTask", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ListPullRecordTaskRes.class);
    }

    /**
     * <p>createRecordPresetV2</p>
     * <p>添加录制配置</p>
     *
     * <p>为指定域名空间下的 App 添加录制模版。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>暂不支持对同一个域名下的同一个 App 绑定多个录制模板，如果多次创建录制模板，会将历史创建的录制模板删除，重新创建新的模板并绑定。</p>
     *
     * <p>:::</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateRecordPresetV2Res createRecordPresetV2(CreateRecordPresetV2Body body) throws Exception {
        RawResponse rawResponse = json("CreateRecordPresetV2", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateRecordPresetV2Res.class);
    }

    /**
     * <p>listVideoClassifications</p>
     * <p>获取点播视频分类</p>
     *
     * <p>获取点播视频分类</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ListVideoClassificationsRes listVideoClassifications(ListVideoClassificationsBody body) throws Exception {
        RawResponse rawResponse = json("ListVideoClassifications", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ListVideoClassificationsRes.class);
    }

    /**
     * <p>deleteSnapshotPreset</p>
     * <p>删除截图配置</p>
     *
     * <p>调用接口删除截图模版配置。调用后，根据模版名称、域名和应用名称信息，先解除应用和模版之间的绑定；其次判断如果没有其它应用绑定这个模版，则安全删除这个模版。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>删除截图配置不会同步删除相关回调配置。</p>
     *
     * <p>:::</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteSnapshotPresetRes deleteSnapshotPreset(DeleteSnapshotPresetBody body) throws Exception {
        RawResponse rawResponse = json("DeleteSnapshotPreset", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteSnapshotPresetRes.class);
    }

    /**
     * <p>updateSnapshotPreset</p>
     * <p>更新截图配置</p>
     *
     * <p>查询域名和应用关联的直播截图模版，并更新某截图模版的配置项。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>调用 [UpdateCallback](https://www.volcengine.com/docs/6469/1126929) 和 [UpdateSnapshotPreset](https://www.volcengine.com/docs/6469/1126863) API，都可以更新截图回调配置，当重复调用以上两个接口更新截图回调配置时，**以最后一次调用的配置为准**。例如，您先调用 UpdateCallback 为某域名空间下的 App 配置了回调地址`https://live.example.com/callback`，之后调用  UpdateSnapshotPreset 再次对该域名空间下的同一 App 配置了回调地址 `https://live.example.com/callback1`，则最终生效的回调地址为 `https://live.example.com/callback1`。</p>
     *
     * <p>:::</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateSnapshotPresetRes updateSnapshotPreset(UpdateSnapshotPresetBody body) throws Exception {
        RawResponse rawResponse = json("UpdateSnapshotPreset", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateSnapshotPresetRes.class);
    }

    /**
     * <p>updateSnapshotPresetV2</p>
     * <p>更新截图配置V2</p>
     *
     * <p>更新截图配置V2</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateSnapshotPresetV2Res updateSnapshotPresetV2(UpdateSnapshotPresetV2Body body) throws Exception {
        RawResponse rawResponse = json("UpdateSnapshotPresetV2", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateSnapshotPresetV2Res.class);
    }

    /**
     * <p>describeCDNSnapshotHistory</p>
     * <p>查询截图历史详情</p>
     *
     * <p>调用接口查询指定 `Vhost` 下的直播截图历史详情。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeCDNSnapshotHistoryRes describeCDNSnapshotHistory(DescribeCDNSnapshotHistoryBody body) throws Exception {
        RawResponse rawResponse = json("DescribeCDNSnapshotHistory", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeCDNSnapshotHistoryRes.class);
    }

    /**
     * <p>listVhostSnapshotPreset</p>
     * <p>查询截图配置列表</p>
     *
     * <p>查询域名维度下所有的 App 名称，以及 App 关联的截图模板。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ListVhostSnapshotPresetRes listVhostSnapshotPreset(ListVhostSnapshotPresetBody body) throws Exception {
        RawResponse rawResponse = json("ListVhostSnapshotPreset", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ListVhostSnapshotPresetRes.class);
    }

    /**
     * <p>listVhostSnapshotPresetV2</p>
     * <p>查询截图配置列表V2</p>
     *
     * <p>查询截图配置列表V2</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ListVhostSnapshotPresetV2Res listVhostSnapshotPresetV2(ListVhostSnapshotPresetV2Body body) throws Exception {
        RawResponse rawResponse = json("ListVhostSnapshotPresetV2", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ListVhostSnapshotPresetV2Res.class);
    }

    /**
     * <p>createSnapshotPreset</p>
     * <p>添加截图配置</p>
     *
     * <p>调用接口添加视频直播截图配置。调用后会先增加截图模版，将新建模版加入模版库中，再将该模版绑定到对应的 App 上。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>调用 [UpdateCallback](https://www.volcengine.com/docs/6469/1126929) 和 [CreateSnapshotPreset](https://www.volcengine.com/docs/6469/1126861) API，都可以更新截图回调配置，当重复调用以上两个接口更新截图回调配置时，**以最后一次调用的配置为准**。例如，您先调用 UpdateCallback 为某域名空间下的 App 配置了回调地址`https://live.example.com/callback`，之后调用  CreateSnapshotPreset 再次对该域名空间下的同一 App 配置了回调地址 `https://live.example.com/callback1`，则最终生效的回调地址为 `https://live.example.com/callback1`。</p>
     *
     * <p>:::</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateSnapshotPresetRes createSnapshotPreset(CreateSnapshotPresetBody body) throws Exception {
        RawResponse rawResponse = json("CreateSnapshotPreset", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateSnapshotPresetRes.class);
    }

    /**
     * <p>createSnapshotPresetV2</p>
     * <p>添加截图配置V2</p>
     *
     * <p>添加截图配置V2</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateSnapshotPresetV2Res createSnapshotPresetV2(CreateSnapshotPresetV2Body body) throws Exception {
        RawResponse rawResponse = json("CreateSnapshotPresetV2", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateSnapshotPresetV2Res.class);
    }

    /**
     * <p>deleteTimeShiftPresetV2</p>
     * <p>删除时移配置</p>
     *
     * <p>删除时移配置</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteTimeShiftPresetV2Res deleteTimeShiftPresetV2(DeleteTimeShiftPresetV2Body body) throws Exception {
        RawResponse rawResponse = json("DeleteTimeShiftPresetV2", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteTimeShiftPresetV2Res.class);
    }

    /**
     * <p>deleteTimeShiftPresetV3</p>
     * <p>删除直播时移配置</p>
     *
     * <p>调用接口删除指定应用的直播时移模板。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteTimeShiftPresetV3Res deleteTimeShiftPresetV3(DeleteTimeShiftPresetV3Body body) throws Exception {
        RawResponse rawResponse = json("DeleteTimeShiftPresetV3", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteTimeShiftPresetV3Res.class);
    }

    /**
     * <p>createTimeShiftPresetV2</p>
     * <p>新增时移配置</p>
     *
     * <p>调用 CreateTimeShiftPresetV2 接口，新增时移配置。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateTimeShiftPresetV2Res createTimeShiftPresetV2(CreateTimeShiftPresetV2Body body) throws Exception {
        RawResponse rawResponse = json("CreateTimeShiftPresetV2", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateTimeShiftPresetV2Res.class);
    }

    /**
     * <p>updateTimeShiftPresetV2</p>
     * <p>更新时移配置</p>
     *
     * <p>更新时移配置</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateTimeShiftPresetV2Res updateTimeShiftPresetV2(UpdateTimeShiftPresetV2Body body) throws Exception {
        RawResponse rawResponse = json("UpdateTimeShiftPresetV2", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateTimeShiftPresetV2Res.class);
    }

    /**
     * <p>updateTimeShiftPresetV3</p>
     * <p>更新直播时移配置</p>
     *
     * <p>修改指定域名空间和 `APP` 的直播时移配置，包括时移时长、配置状态等信息。 </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateTimeShiftPresetV3Res updateTimeShiftPresetV3(UpdateTimeShiftPresetV3Body body) throws Exception {
        RawResponse rawResponse = json("UpdateTimeShiftPresetV3", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateTimeShiftPresetV3Res.class);
    }

    /**
     * <p>describeTimeShiftPresetDetail</p>
     * <p>查询时移详情</p>
     *
     * <p>查询时移详情</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeTimeShiftPresetDetailRes describeTimeShiftPresetDetail(DescribeTimeShiftPresetDetailBody body) throws Exception {
        RawResponse rawResponse = json("DescribeTimeShiftPresetDetail", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeTimeShiftPresetDetailRes.class);
    }

    /**
     * <p>listTimeShiftPresetV2</p>
     * <p>查询直播时移配置列表</p>
     *
     * <p>根据域名查询指定应用绑定的时移模板列表。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ListTimeShiftPresetV2Res listTimeShiftPresetV2(ListTimeShiftPresetV2Body body) throws Exception {
        RawResponse rawResponse = json("ListTimeShiftPresetV2", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ListTimeShiftPresetV2Res.class);
    }

    /**
     * <p>createTimeShiftPresetV3</p>
     * <p>添加直播时移配置</p>
     *
     * <p>调用 CreateTimeShiftPresetV3 接口，新增直播时移配置。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateTimeShiftPresetV3Res createTimeShiftPresetV3(CreateTimeShiftPresetV3Body body) throws Exception {
        RawResponse rawResponse = json("CreateTimeShiftPresetV3", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateTimeShiftPresetV3Res.class);
    }

    /**
     * <p>generateTimeShiftPlayURL</p>
     * <p>生成时移播放地址</p>
     *
     * <p>生成时移播放地址</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public GenerateTimeShiftPlayURLRes generateTimeShiftPlayURL(GenerateTimeShiftPlayURLBody body) throws Exception {
        RawResponse rawResponse = json("GenerateTimeShiftPlayURL", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, GenerateTimeShiftPlayURLRes.class);
    }

    /**
     * <p>listVhostDomainDetailByUserID</p>
     * <p>子账号查询vhost和域名详情</p>
     *
     * <p>子账号查询vhost和域名详情</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ListVhostDomainDetailByUserIDRes listVhostDomainDetailByUserID(ListVhostDomainDetailByUserIDBody body) throws Exception {
        RawResponse rawResponse = json("ListVhostDomainDetailByUserID", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ListVhostDomainDetailByUserIDRes.class);
    }

    /**
     * <p>updateVhostTags</p>
     * <p>更新域名空间标签</p>
     *
     * <p>更新域名空间标签</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateVhostTagsRes updateVhostTags(UpdateVhostTagsBody body) throws Exception {
        RawResponse rawResponse = json("UpdateVhostTags", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateVhostTagsRes.class);
    }

    /**
     * <p>listVhostDetail</p>
     * <p>查询Vhost详情列表</p>
     *
     * <p>查询vhost详情</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ListVhostDetailRes listVhostDetail(ListVhostDetailBody body) throws Exception {
        RawResponse rawResponse = json("ListVhostDetail", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ListVhostDetailRes.class);
    }

    /**
     * <p>listVhostDetailByAdmin</p>
     * <p>查询Vhost详情列表（内部）</p>
     *
     * <p>查询Vhost详情列表（内部）</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ListVhostDetailByAdminRes listVhostDetailByAdmin(ListVhostDetailByAdminBody body) throws Exception {
        RawResponse rawResponse = json("ListVhostDetailByAdmin", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ListVhostDetailByAdminRes.class);
    }

    /**
     * <p>describeVhost</p>
     * <p>查询域名空间详情</p>
     *
     * <p>查询域名空间详情</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeVhostRes describeVhost(DescribeVhostBody body) throws Exception {
        RawResponse rawResponse = json("DescribeVhost", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeVhostRes.class);
    }

    /**
     * <p>getTags</p>
     * <p>获取标签列表</p>
     *
     * <p>获取标签列表</p>
     *
     * @return response data
     * @throws Exception error during request
     */
    public GetTagsRes getTags() throws Exception {
        RawResponse rawResponse = json("GetTags", null, "");
        return parseRawResponse(rawResponse, GetTagsRes.class);
    }

    /**
     * <p>listProjects</p>
     * <p>获取项目列表</p>
     *
     * <p>获取项目列表</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ListProjectsRes listProjects(ListProjectsBody body) throws Exception {
        RawResponse rawResponse = json("ListProjects", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ListProjectsRes.class);
    }

    /**
     * <p>deleteCallback</p>
     * <p>删除回调配置</p>
     *
     * <p>删除指定的 `Vhost` 和 `APP` 下的某个指定类型的回调配置。 </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteCallbackRes deleteCallback(DeleteCallbackBody body) throws Exception {
        RawResponse rawResponse = json("DeleteCallback", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteCallbackRes.class);
    }

    /**
     * <p>describeCallback</p>
     * <p>查询回调配置</p>
     *
     * <p>根据 `Domain` 和 `App` 类型信息，查询对应的回调信息。 </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeCallbackRes describeCallback(DescribeCallbackBody body) throws Exception {
        RawResponse rawResponse = json("DescribeCallback", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeCallbackRes.class);
    }

    /**
     * <p>updateCallback</p>
     * <p>添加或更新回调配置</p>
     *
     * <p>添加或更新直播推流、直播断流、录制和截图的回调。在更新场景下，调用成功后，会对所有的回调内容做全量更新。 </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateCallbackRes updateCallback(UpdateCallbackBody body) throws Exception {
        RawResponse rawResponse = json("UpdateCallback", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateCallbackRes.class);
    }

    /**
     * <p>deleteAuth</p>
     * <p>删除鉴权配置</p>
     *
     * <p>删除鉴权配置</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteAuthRes deleteAuth(DeleteAuthBody body) throws Exception {
        RawResponse rawResponse = json("DeleteAuth", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteAuthRes.class);
    }

    /**
     * <p>enableAuth</p>
     * <p>启用推拉流鉴权配置</p>
     *
     * <p>启用推拉流鉴权配置</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public EnableAuthRes enableAuth(EnableAuthBody body) throws Exception {
        RawResponse rawResponse = json("EnableAuth", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, EnableAuthRes.class);
    }

    /**
     * <p>describeAuth</p>
     * <p>查询推拉流鉴权</p>
     *
     * <p>调用接口查询推拉流鉴权信息。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeAuthRes describeAuth(DescribeAuthBody body) throws Exception {
        RawResponse rawResponse = json("DescribeAuth", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeAuthRes.class);
    }

    /**
     * <p>disableAuth</p>
     * <p>禁用推拉流鉴权配置</p>
     *
     * <p>禁用推拉流鉴权配置</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DisableAuthRes disableAuth(DisableAuthBody body) throws Exception {
        RawResponse rawResponse = json("DisableAuth", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DisableAuthRes.class);
    }

    /**
     * <p>deleteCert</p>
     * <p>删除证书</p>
     *
     * <p>删除一个已经上传的证书。 </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteCertRes deleteCert(DeleteCertBody body) throws Exception {
        RawResponse rawResponse = json("DeleteCert", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteCertRes.class);
    }

    /**
     * <p>updateCert</p>
     * <p>更新证书</p>
     *
     * <p>调用接口，更新指定证书的信息，当前仅支持更新证书名称。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateCertRes updateCert(UpdateCertBody body) throws Exception {
        RawResponse rawResponse = json("UpdateCert", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateCertRes.class);
    }

    /**
     * <p>describeCertDetailSecretV2</p>
     * <p>查看证书详情</p>
     *
     * <p>查询证书详情V2</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeCertDetailSecretV2Res describeCertDetailSecretV2(DescribeCertDetailSecretV2Body body) throws Exception {
        RawResponse rawResponse = json("DescribeCertDetailSecretV2", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeCertDetailSecretV2Res.class);
    }

    /**
     * <p>listCertV2</p>
     * <p>查询证书列表</p>
     *
     * <p>查看当前账号下的证书列表。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ListCertV2Res listCertV2(ListCertV2Body body) throws Exception {
        RawResponse rawResponse = json("ListCertV2", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ListCertV2Res.class);
    }

    /**
     * <p>describeCertDetailV2</p>
     * <p>查询证书详情V2</p>
     *
     * <p>查询证书详情V2</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeCertDetailV2Res describeCertDetailV2(DescribeCertDetailV2Body body) throws Exception {
        RawResponse rawResponse = json("DescribeCertDetailV2", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeCertDetailV2Res.class);
    }

    /**
     * <p>createCert</p>
     * <p>添加证书</p>
     *
     * <p>调用该接口上传证书，需要填写证书名称和证书内容等参数。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateCertRes createCert(CreateCertBody body) throws Exception {
        RawResponse rawResponse = json("CreateCert", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateCertRes.class);
    }

    /**
     * <p>bindCert</p>
     * <p>绑定证书</p>
     *
     * <p>调用接口绑定域名与证书。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public BindCertRes bindCert(BindCertBody body) throws Exception {
        RawResponse rawResponse = json("BindCert", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, BindCertRes.class);
    }

    /**
     * <p>unbindCert</p>
     * <p>解绑证书</p>
     *
     * <p>解除域名和证书之间的绑定关系。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UnbindCertRes unbindCert(UnbindCertBody body) throws Exception {
        RawResponse rawResponse = json("UnbindCert", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UnbindCertRes.class);
    }

    /**
     * <p>listObject</p>
     * <p>/2023-01-01/ListObject</p>
     *
     * <p>/2020-08-01/ListObject</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ListObjectRes listObject(ListObjectBody body) throws Exception {
        RawResponse rawResponse = json("ListObject", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ListObjectRes.class);
    }

    /**
     * <p>managerPullPushDomainBind</p>
     * <p>修改推拉流域名绑定关系</p>
     *
     * <p>修改推流域名和拉流域名的绑定关系。支持指定拉流域名绑定/解绑推流域名。 </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ManagerPullPushDomainBindRes managerPullPushDomainBind(ManagerPullPushDomainBindBody body) throws Exception {
        RawResponse rawResponse = json("ManagerPullPushDomainBind", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ManagerPullPushDomainBindRes.class);
    }

    /**
     * <p>describeCertDetailSecret</p>
     * <p>查看证书详情</p>
     *
     * <p>查看一个证书的详细信息，包括绑定的域名、证书名称等信息。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeCertDetailSecretRes describeCertDetailSecret(DescribeCertDetailSecretBody body) throws Exception {
        RawResponse rawResponse = json("DescribeCertDetailSecret", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeCertDetailSecretRes.class);
    }

    /**
     * <p>describeDomainVerify</p>
     * <p>查询域名归属校验详情</p>
     *
     * <p>查询域名归属校验详情</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeDomainVerifyRes describeDomainVerify(DescribeDomainVerifyBody body) throws Exception {
        RawResponse rawResponse = json("DescribeDomainVerify", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeDomainVerifyRes.class);
    }

    /**
     * <p>createVerifyContent</p>
     * <p>查询校验归属权内容</p>
     *
     * <p>调用CreateVerifyContent查询归属校验内容。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateVerifyContentRes createVerifyContent(CreateVerifyContentBody body) throws Exception {
        RawResponse rawResponse = json("CreateVerifyContent", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateVerifyContentRes.class);
    }

    /**
     * <p>listVqosDimensionValues</p>
     * <p>查询维度值</p>
     *
     * <p>查询维度值</p>
     *
     * @param query query arguments
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ListVqosDimensionValuesRes listVqosDimensionValues(ListVqosDimensionValuesQuery query, ListVqosDimensionValuesBody body) throws Exception {
        RawResponse rawResponse = json("ListVqosDimensionValues", Utils.paramsToPair(query), JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ListVqosDimensionValuesRes.class);
    }

    /**
     * <p>listCert</p>
     * <p>查询证书列表</p>
     *
     * <p>查看当前账号下的证书列表。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ListCertRes listCert(ListCertBody body) throws Exception {
        RawResponse rawResponse = json("ListCert", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ListCertRes.class);
    }

    /**
     * <p>listCertBindInfo</p>
     * <p>查询证书绑定列表</p>
     *
     * <p>查询证书绑定列表</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ListCertBindInfoRes listCertBindInfo(ListCertBindInfoBody body) throws Exception {
        RawResponse rawResponse = json("ListCertBindInfo", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ListCertBindInfoRes.class);
    }

    /**
     * <p>describeLiveFreeTimeInterval</p>
     * <p>查询闲时时间段</p>
     *
     * <p>查询闲时时间段</p>
     *
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveFreeTimeIntervalRes describeLiveFreeTimeInterval() throws Exception {
        RawResponse rawResponse = json("DescribeLiveFreeTimeInterval", null, "");
        return parseRawResponse(rawResponse, DescribeLiveFreeTimeIntervalRes.class);
    }

    /**
     * <p>verifyDomainOwner</p>
     * <p>校验域名归属权</p>
     *
     * <p>调用VerifyDomainOwner对域名归属权进行校验。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public VerifyDomainOwnerRes verifyDomainOwner(VerifyDomainOwnerBody body) throws Exception {
        RawResponse rawResponse = json("VerifyDomainOwner", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, VerifyDomainOwnerRes.class);
    }

    /**
     * <p>validateCert</p>
     * <p>校验证书</p>
     *
     * <p>检验domain和证书是否合法</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ValidateCertRes validateCert(ValidateCertBody body) throws Exception {
        RawResponse rawResponse = json("ValidateCert", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ValidateCertRes.class);
    }

    /**
     * <p>deleteDomain</p>
     * <p>删除域名</p>
     *
     * <p>删除已添加的推/拉流域名。 </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteDomainRes deleteDomain(DeleteDomainBody body) throws Exception {
        RawResponse rawResponse = json("DeleteDomain", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteDomainRes.class);
    }

    /**
     * <p>deleteDomainV2</p>
     * <p>删除域名V2</p>
     *
     * <p>删除域名V2</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteDomainV2Res deleteDomainV2(DeleteDomainV2Body body) throws Exception {
        RawResponse rawResponse = json("DeleteDomainV2", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteDomainV2Res.class);
    }

    /**
     * <p>enableDomain</p>
     * <p>启用域名</p>
     *
     * <p>启用某个直播域名。启用后，域名状态从`2-禁用状态`变为`0-正常状态`。 </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public EnableDomainRes enableDomain(EnableDomainBody body) throws Exception {
        RawResponse rawResponse = json("EnableDomain", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, EnableDomainRes.class);
    }

    /**
     * <p>createDomainV2</p>
     * <p>批量添加域名</p>
     *
     * <p>批量添加域名。域名请在工信部完成备案。新添加的域名的状态为**审核中**。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateDomainV2Res createDomainV2(CreateDomainV2Body body) throws Exception {
        RawResponse rawResponse = json("CreateDomainV2", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateDomainV2Res.class);
    }

    /**
     * <p>rejectDomain</p>
     * <p>拒绝域名</p>
     *
     * <p>拒绝域名</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public RejectDomainRes rejectDomain(RejectDomainBody body) throws Exception {
        RawResponse rawResponse = json("RejectDomain", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, RejectDomainRes.class);
    }

    /**
     * <p>updateDomainVhost</p>
     * <p>更新域名的域名空间</p>
     *
     * <p>切换推流域名或拉流域名的域名空间。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateDomainVhostRes updateDomainVhost(UpdateDomainVhostBody body) throws Exception {
        RawResponse rawResponse = json("UpdateDomainVhost", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateDomainVhostRes.class);
    }

    /**
     * <p>updateDomain</p>
     * <p>更新域名的属性</p>
     *
     * <p>更新域名的属性</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateDomainRes updateDomain(UpdateDomainBody body) throws Exception {
        RawResponse rawResponse = json("UpdateDomain", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateDomainRes.class);
    }

    /**
     * <p>describeDomain</p>
     * <p>查询域名信息</p>
     *
     * <p>查询域名的详细信息，包括但不限于域名空间、CName、类型、域名状态。 </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeDomainRes describeDomain(DescribeDomainBody body) throws Exception {
        RawResponse rawResponse = json("DescribeDomain", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeDomainRes.class);
    }

    /**
     * <p>listDomainDetail</p>
     * <p>查询域名列表</p>
     *
     * <p>调用 ListDomainDetail 接口，根据域名状态、类别等信息，过滤查询当前账号下的的域名列表信息。 </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ListDomainDetailRes listDomainDetail(ListDomainDetailBody body) throws Exception {
        RawResponse rawResponse = json("ListDomainDetail", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ListDomainDetailRes.class);
    }

    /**
     * <p>createDomain</p>
     * <p>添加域名</p>
     *
     * <p>添加推拉流域名。</p>
     *
     * <p>一次只能提交一个域名。域名请在工信部完成备案。新添加域名的状态默认为**审核中**。  </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateDomainRes createDomain(CreateDomainBody body) throws Exception {
        RawResponse rawResponse = json("CreateDomain", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateDomainRes.class);
    }

    /**
     * <p>disableDomain</p>
     * <p>禁用域名</p>
     *
     * <p>禁用某个直播域名。禁用后，域名状态从`0-正常状态`变为`2-禁用状态`。 </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DisableDomainRes disableDomain(DisableDomainBody body) throws Exception {
        RawResponse rawResponse = json("DisableDomain", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DisableDomainRes.class);
    }

    /**
     * <p>createVQScoreTask</p>
     * <p>创建拉流测评任务</p>
     *
     * <p>默认每个用户只能同时进行3个测评任务</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateVQScoreTaskRes createVQScoreTask(CreateVQScoreTaskBody body) throws Exception {
        RawResponse rawResponse = json("CreateVQScoreTask", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateVQScoreTaskRes.class);
    }

    /**
     * <p>describeVQScoreTask</p>
     * <p>查询测评任务</p>
     *
     * <p>根据测试任务ID，查询测评任务结果详情。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeVQScoreTaskRes describeVQScoreTask(DescribeVQScoreTaskBody body) throws Exception {
        RawResponse rawResponse = json("DescribeVQScoreTask", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeVQScoreTaskRes.class);
    }

    /**
     * <p>listVQScoreTask</p>
     * <p>获取测评任务列表</p>
     *
     * <p>获取测评任务列表详情。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ListVQScoreTaskRes listVQScoreTask(ListVQScoreTaskBody body) throws Exception {
        RawResponse rawResponse = json("ListVQScoreTask", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ListVQScoreTaskRes.class);
    }

    /**
     * <p>stopPullToPushTask</p>
     * <p>停用拉流转推任务</p>
     *
     * <p>创建拉流转推任务成功后，使用该接口停用任务。 </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public StopPullToPushTaskRes stopPullToPushTask(StopPullToPushTaskBody body) throws Exception {
        RawResponse rawResponse = json("StopPullToPushTask", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, StopPullToPushTaskRes.class);
    }

    /**
     * <p>createPullToPushTask</p>
     * <p>创建拉流转推任务</p>
     *
     * <p>创建一个拉流转推任务，支持从点播拉流与从直播拉流两种方式。 </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreatePullToPushTaskRes createPullToPushTask(CreatePullToPushTaskBody body) throws Exception {
        RawResponse rawResponse = json("CreatePullToPushTask", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreatePullToPushTaskRes.class);
    }

    /**
     * <p>deletePullToPushTask</p>
     * <p>删除拉流转推任务</p>
     *
     * <p>创建拉流转推任务成功后，使用该接口删除任务。 </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeletePullToPushTaskRes deletePullToPushTask(DeletePullToPushTaskBody body) throws Exception {
        RawResponse rawResponse = json("DeletePullToPushTask", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeletePullToPushTaskRes.class);
    }

    /**
     * <p>restartPullToPushTask</p>
     * <p>启用拉流转推任务</p>
     *
     * <p>创建拉流转推任务成功后，使用该接口启用任务。 </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public RestartPullToPushTaskRes restartPullToPushTask(RestartPullToPushTaskBody body) throws Exception {
        RawResponse rawResponse = json("RestartPullToPushTask", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, RestartPullToPushTaskRes.class);
    }

    /**
     * <p>updatePullToPushTask</p>
     * <p>更新拉流转推任务</p>
     *
     * <p>创建拉流转推任务成功后，使用该接口修改任务参数。 </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdatePullToPushTaskRes updatePullToPushTask(UpdatePullToPushTaskBody body) throws Exception {
        RawResponse rawResponse = json("UpdatePullToPushTask", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdatePullToPushTaskRes.class);
    }

    /**
     * <p>listPullToPushTask</p>
     * <p>获取拉流转推任务列表</p>
     *
     * <p>获取当前账号下，已经创建的拉流转推任务列表。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public ListPullToPushTaskRes listPullToPushTask(ListPullToPushTaskQuery query) throws Exception {
        RawResponse rawResponse = json("ListPullToPushTask", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, ListPullToPushTaskRes.class);
    }

    /**
     * <p>deleteDenyConfigV2</p>
     * <p>删除 IP 黑白名单</p>
     *
     * <p>删除 IP 黑白名单配置。 </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteDenyConfigV2Res deleteDenyConfigV2(DeleteDenyConfigV2Body body) throws Exception {
        RawResponse rawResponse = json("DeleteDenyConfigV2", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteDenyConfigV2Res.class);
    }

    /**
     * <p>describeDenyConfigV2</p>
     * <p>查询 IP 黑白名单</p>
     *
     * <p>调用接口查询 IP 黑白名单配置。 </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeDenyConfigV2Res describeDenyConfigV2(DescribeDenyConfigV2Body body) throws Exception {
        RawResponse rawResponse = json("DescribeDenyConfigV2", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeDenyConfigV2Res.class);
    }

    /**
     * <p>deleteRelaySourceRewrite</p>
     * <p>删除回源改写配置</p>
     *
     * <p>删除回源改写配置</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteRelaySourceRewriteRes deleteRelaySourceRewrite(DeleteRelaySourceRewriteBody body) throws Exception {
        RawResponse rawResponse = json("DeleteRelaySourceRewrite", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteRelaySourceRewriteRes.class);
    }

    /**
     * <p>deleteRelaySourceV4</p>
     * <p>删除固定回源配置</p>
     *
     * <p>本接口支持删除域名空间下指定的固定回源（含永久回源）配置。 </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteRelaySourceV4Res deleteRelaySourceV4(DeleteRelaySourceV4Body body) throws Exception {
        RawResponse rawResponse = json("DeleteRelaySourceV4", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteRelaySourceV4Res.class);
    }

    /**
     * <p>deleteRelaySourceV3</p>
     * <p>删除播放触发回源配置</p>
     *
     * <p>删除指定范围内的拉流回源配置。 </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteRelaySourceV3Res deleteRelaySourceV3(DeleteRelaySourceV3Body body) throws Exception {
        RawResponse rawResponse = json("DeleteRelaySourceV3", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteRelaySourceV3Res.class);
    }

    /**
     * <p>updateRelaySourceRewrite</p>
     * <p>更新回源改写配置</p>
     *
     * <p>更新回源改写配置</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateRelaySourceRewriteRes updateRelaySourceRewrite(UpdateRelaySourceRewriteBody body) throws Exception {
        RawResponse rawResponse = json("UpdateRelaySourceRewrite", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateRelaySourceRewriteRes.class);
    }

    /**
     * <p>updateRelaySourceV4</p>
     * <p>更新固定回源配置</p>
     *
     * <p>本接口支持更新域名空间下指定的固定回源（含永久回源）配置。 </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateRelaySourceV4Res updateRelaySourceV4(UpdateRelaySourceV4Body body) throws Exception {
        RawResponse rawResponse = json("UpdateRelaySourceV4", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateRelaySourceV4Res.class);
    }

    /**
     * <p>describeRelaySourceRewrite</p>
     * <p>查询回源改写配置</p>
     *
     * <p>查询回源改写配置</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeRelaySourceRewriteRes describeRelaySourceRewrite(DescribeRelaySourceRewriteBody body) throws Exception {
        RawResponse rawResponse = json("DescribeRelaySourceRewrite", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeRelaySourceRewriteRes.class);
    }

    /**
     * <p>listRelaySourceV4</p>
     * <p>查询固定回源配置列表</p>
     *
     * <p>本接口支持查询域名空间的固定回源（含永久回源）配置列表。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ListRelaySourceV4Res listRelaySourceV4(ListRelaySourceV4Body body) throws Exception {
        RawResponse rawResponse = json("ListRelaySourceV4", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ListRelaySourceV4Res.class);
    }

    /**
     * <p>describeRelaySourceV3</p>
     * <p>查询播放触发回源配置</p>
     *
     * <p>本接口支持根据 `Vhost` 信息，查询对应的播放触发的拉流回源配置信息。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeRelaySourceV3Res describeRelaySourceV3(DescribeRelaySourceV3Body body) throws Exception {
        RawResponse rawResponse = json("DescribeRelaySourceV3", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeRelaySourceV3Res.class);
    }

    /**
     * <p>createRelaySourceV4</p>
     * <p>添加固定回源配置</p>
     *
     * <p>本接口支持对域名空间下指定的 App 和 Stream 添加固定回源（含永久回源）配置。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateRelaySourceV4Res createRelaySourceV4(CreateRelaySourceV4Body body) throws Exception {
        RawResponse rawResponse = json("CreateRelaySourceV4", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateRelaySourceV4Res.class);
    }

    /**
     * <p>updateRelaySourceV3</p>
     * <p>添加或更新播放触发回源配置</p>
     *
     * <p>添加回源配置。本接口支持在指定应用名称后，选择相应的回源协议和回源地址，添加新的拉流回源配置。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateRelaySourceV3Res updateRelaySourceV3(UpdateRelaySourceV3Body body) throws Exception {
        RawResponse rawResponse = json("UpdateRelaySourceV3", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateRelaySourceV3Res.class);
    }

    /**
     * <p>killStream</p>
     * <p>断开直播流</p>
     *
     * <p>调用接口断开指定的在线流。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public KillStreamRes killStream(KillStreamBody body) throws Exception {
        RawResponse rawResponse = json("KillStream", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, KillStreamRes.class);
    }

    /**
     * <p>describeClosedStreamInfoByPage</p>
     * <p>查询历史流列表</p>
     *
     * <p>调用接口分页查询历史流信息。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public DescribeClosedStreamInfoByPageRes describeClosedStreamInfoByPage(DescribeClosedStreamInfoByPageQuery query) throws Exception {
        RawResponse rawResponse = json("DescribeClosedStreamInfoByPage", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, DescribeClosedStreamInfoByPageRes.class);
    }

    /**
     * <p>describeLiveStreamInfoByPage</p>
     * <p>查询在线流列表</p>
     *
     * <p>调用接口分页查询在线流列表信息。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveStreamInfoByPageRes describeLiveStreamInfoByPage(DescribeLiveStreamInfoByPageQuery query) throws Exception {
        RawResponse rawResponse = json("DescribeLiveStreamInfoByPage", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, DescribeLiveStreamInfoByPageRes.class);
    }

    /**
     * <p>describeLiveStreamState</p>
     * <p>查询流状态</p>
     *
     * <p>调用接口查询指定流的当前推流状态。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveStreamStateRes describeLiveStreamState(DescribeLiveStreamStateQuery query) throws Exception {
        RawResponse rawResponse = json("DescribeLiveStreamState", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, DescribeLiveStreamStateRes.class);
    }

    /**
     * <p>describeForbiddenStreamInfoByPage</p>
     * <p>查询禁推流列表</p>
     *
     * <p>调用接口分页查询禁止直播推流的流列表。</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public DescribeForbiddenStreamInfoByPageRes describeForbiddenStreamInfoByPage(DescribeForbiddenStreamInfoByPageQuery query) throws Exception {
        RawResponse rawResponse = json("DescribeForbiddenStreamInfoByPage", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, DescribeForbiddenStreamInfoByPageRes.class);
    }

    /**
     * <p>forbidStream</p>
     * <p>禁推直播流</p>
     *
     * <p>调用接口禁止指定在线流的推流。 </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ForbidStreamRes forbidStream(ForbidStreamBody body) throws Exception {
        RawResponse rawResponse = json("ForbidStream", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ForbidStreamRes.class);
    }

    /**
     * <p>resumeStream</p>
     * <p>解禁直播流</p>
     *
     * <p>调用接口指定某个被禁推的直播流，恢复该直播流的推流。 </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ResumeStreamRes resumeStream(ResumeStreamBody body) throws Exception {
        RawResponse rawResponse = json("ResumeStream", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ResumeStreamRes.class);
    }

    /**
     * <p>generatePlayURL</p>
     * <p>生成拉流地址</p>
     *
     * <p>调用接口生成拉流地址。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public GeneratePlayURLRes generatePlayURL(GeneratePlayURLBody body) throws Exception {
        RawResponse rawResponse = json("GeneratePlayURL", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, GeneratePlayURLRes.class);
    }

    /**
     * <p>generatePushURL</p>
     * <p>生成推流地址</p>
     *
     * <p>调用接口生成推流地址。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public GeneratePushURLRes generatePushURL(GeneratePushURLBody body) throws Exception {
        RawResponse rawResponse = json("GeneratePushURL", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, GeneratePushURLRes.class);
    }

    /**
     * <p>updateSDKLicense</p>
     * <p>SDK续签转正延期</p>
     *
     * <p>SDK续签转正</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateSDKLicenseRes updateSDKLicense(UpdateSDKLicenseBody body) throws Exception {
        RawResponse rawResponse = json("UpdateSDKLicense", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateSDKLicenseRes.class);
    }

    /**
     * <p>createApp</p>
     * <p>创建APP</p>
     *
     * <p>创建APP</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateAppRes createApp(CreateAppBody body) throws Exception {
        RawResponse rawResponse = json("CreateApp", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateAppRes.class);
    }

    /**
     * <p>deleteSDK</p>
     * <p>删除SDK</p>
     *
     * <p>删除SDK</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteSDKRes deleteSDK(DeleteSDKBody body) throws Exception {
        RawResponse rawResponse = json("DeleteSDK", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteSDKRes.class);
    }

    /**
     * <p>updateApp</p>
     * <p>更新APP</p>
     *
     * <p>更新APP</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateAppRes updateApp(UpdateAppBody body) throws Exception {
        RawResponse rawResponse = json("UpdateApp", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateAppRes.class);
    }

    /**
     * <p>updateSDK</p>
     * <p>更新SDK</p>
     *
     * <p>更新SDK</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateSDKRes updateSDK(UpdateSDKBody body) throws Exception {
        RawResponse rawResponse = json("UpdateSDK", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateSDKRes.class);
    }

    /**
     * <p>describeSDKDetail</p>
     * <p>查询sdk详情</p>
     *
     * <p>查询sdk详情</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeSDKDetailRes describeSDKDetail(DescribeSDKDetailBody body) throws Exception {
        RawResponse rawResponse = json("DescribeSDKDetail", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeSDKDetailRes.class);
    }

    /**
     * <p>describeSDKParamsAvailable</p>
     * <p>校验BundleID和Package可用</p>
     *
     * <p>校验BundleID和Package可用</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeSDKParamsAvailableRes describeSDKParamsAvailable(DescribeSDKParamsAvailableBody body) throws Exception {
        RawResponse rawResponse = json("DescribeSDKParamsAvailable", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeSDKParamsAvailableRes.class);
    }

    /**
     * <p>describeAppIDParamsAvailable</p>
     * <p>检查AppID是否有效</p>
     *
     * <p>检查AppID是否有效</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeAppIDParamsAvailableRes describeAppIDParamsAvailable(DescribeAppIDParamsAvailableBody body) throws Exception {
        RawResponse rawResponse = json("DescribeAppIDParamsAvailable", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeAppIDParamsAvailableRes.class);
    }

    /**
     * <p>createSDK</p>
     * <p>添加SDK</p>
     *
     * <p>添加SDK</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateSDKRes createSDK(CreateSDKBody body) throws Exception {
        RawResponse rawResponse = json("CreateSDK", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateSDKRes.class);
    }

    /**
     * <p>listSDK</p>
     * <p>获取SDK列表</p>
     *
     * <p>查询sdk列表</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ListSDKRes listSDK(ListSDKBody body) throws Exception {
        RawResponse rawResponse = json("ListSDK", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ListSDKRes.class);
    }

    /**
     * <p>listSDKAdmin</p>
     * <p>获取SDK列表Vadmin</p>
     *
     * <p>获取接口列表</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ListSDKAdminRes listSDKAdmin(ListSDKAdminBody body) throws Exception {
        RawResponse rawResponse = json("ListSDKAdmin", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ListSDKAdminRes.class);
    }

    /**
     * <p>getApps</p>
     * <p>获取应用列表</p>
     *
     * <p>查询该账号下的应用列表</p>
     *
     * @return response data
     * @throws Exception error during request
     */
    public GetAppsRes getApps() throws Exception {
        RawResponse rawResponse = json("GetApps", null, "");
        return parseRawResponse(rawResponse, GetAppsRes.class);
    }

    /**
     * <p>updateService</p>
     * <p>更新服务</p>
     *
     * <p>更新服务</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateServiceRes updateService(UpdateServiceBody body) throws Exception {
        RawResponse rawResponse = json("UpdateService", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateServiceRes.class);
    }

    /**
     * <p>listServices</p>
     * <p>查询服务列表</p>
     *
     * <p>查询服务列表</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ListServicesRes listServices(ListServicesBody body) throws Exception {
        RawResponse rawResponse = json("ListServices", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ListServicesRes.class);
    }

    /**
     * <p>describeService</p>
     * <p>查询服务详情</p>
     *
     * <p>查询服务详情</p>
     *
     * @return response data
     * @throws Exception error during request
     */
    public DescribeServiceRes describeService() throws Exception {
        RawResponse rawResponse = json("DescribeService", null, "");
        return parseRawResponse(rawResponse, DescribeServiceRes.class);
    }

    /**
     * <p>updateActivityBilling</p>
     * <p>更新活动带宽计费配置</p>
     *
     * <p>更新活动带宽计费配置</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateActivityBillingRes updateActivityBilling(UpdateActivityBillingBody body) throws Exception {
        RawResponse rawResponse = json("UpdateActivityBilling", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateActivityBillingRes.class);
    }

    /**
     * <p>updateBilling</p>
     * <p>更新计费订单</p>
     *
     * <p>更新计费订单</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateBillingRes updateBilling(UpdateBillingBody body) throws Exception {
        RawResponse rawResponse = json("UpdateBilling", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateBillingRes.class);
    }

    /**
     * <p>listInstance</p>
     * <p>查询实例信息</p>
     *
     * <p>查询实例信息</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ListInstanceRes listInstance(ListInstanceBody body) throws Exception {
        RawResponse rawResponse = json("ListInstance", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ListInstanceRes.class);
    }

    /**
     * <p>describeBillingForAdmin</p>
     * <p>查询计费方式详情（内部接口）</p>
     *
     * <p>查询计费方式详情（内部接口）</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeBillingForAdminRes describeBillingForAdmin(DescribeBillingForAdminBody body) throws Exception {
        RawResponse rawResponse = json("DescribeBillingForAdmin", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeBillingForAdminRes.class);
    }

    /**
     * <p>describeBilling</p>
     * <p>查询计费订单详情</p>
     *
     * <p>查询计费订单详情</p>
     *
     * @return response data
     * @throws Exception error during request
     */
    public DescribeBillingRes describeBilling() throws Exception {
        RawResponse rawResponse = json("DescribeBilling", null, "");
        return parseRawResponse(rawResponse, DescribeBillingRes.class);
    }

    /**
     * <p>describeBillingMonthAvailable</p>
     * <p>查询账号是否有月结计费权限</p>
     *
     * <p>查询账号是否有月结计费权限</p>
     *
     * @return response data
     * @throws Exception error during request
     */
    public DescribeBillingMonthAvailableRes describeBillingMonthAvailable() throws Exception {
        RawResponse rawResponse = json("DescribeBillingMonthAvailable", null, "");
        return parseRawResponse(rawResponse, DescribeBillingMonthAvailableRes.class);
    }

    /**
     * <p>listResourcePackage</p>
     * <p>查询资源包信息</p>
     *
     * <p>查询资源包信息</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ListResourcePackageRes listResourcePackage(ListResourcePackageBody body) throws Exception {
        RawResponse rawResponse = json("ListResourcePackage", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ListResourcePackageRes.class);
    }

    /**
     * <p>terminateInstance</p>
     * <p>退订实例</p>
     *
     * <p>退订实例</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public TerminateInstanceRes terminateInstance(TerminateInstanceBody body) throws Exception {
        RawResponse rawResponse = json("TerminateInstance", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, TerminateInstanceRes.class);
    }

    /**
     * <p>deleteStreamQuotaConfig</p>
     * <p>删除推拉流限额配置</p>
     *
     * <p>删除指定推/拉流域名的限额配置。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteStreamQuotaConfigRes deleteStreamQuotaConfig(DeleteStreamQuotaConfigBody body) throws Exception {
        RawResponse rawResponse = json("DeleteStreamQuotaConfig", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteStreamQuotaConfigRes.class);
    }

    /**
     * <p>updateStreamQuotaConfigPatch</p>
     * <p>批量添加或者更新推拉流限额配置</p>
     *
     * <p>批量添加或者更新推拉流限额配置，只在vadmin使用</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateStreamQuotaConfigPatchRes updateStreamQuotaConfigPatch(UpdateStreamQuotaConfigPatchBody body) throws Exception {
        RawResponse rawResponse = json("UpdateStreamQuotaConfigPatch", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateStreamQuotaConfigPatchRes.class);
    }

    /**
     * <p>describeStreamQuotaConfig</p>
     * <p>查询推拉流限流配置</p>
     *
     * <p>查询指定推/拉流域名的限额配置。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeStreamQuotaConfigRes describeStreamQuotaConfig(DescribeStreamQuotaConfigBody body) throws Exception {
        RawResponse rawResponse = json("DescribeStreamQuotaConfig", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeStreamQuotaConfigRes.class);
    }

    /**
     * <p>updateStreamQuotaConfig</p>
     * <p>添加或更新推拉流限额配置</p>
     *
     * <p>添加或更新推拉流限额配置。更新时，会对所有的限额参数做**全量覆盖更新**。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateStreamQuotaConfigRes updateStreamQuotaConfig(UpdateStreamQuotaConfigBody body) throws Exception {
        RawResponse rawResponse = json("UpdateStreamQuotaConfig", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateStreamQuotaConfigRes.class);
    }

    /**
     * <p>listVqosMetricsDimensions</p>
     * <p>获取图表指标维度信息</p>
     *
     * <p>获取图表指标维度信息</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public ListVqosMetricsDimensionsRes listVqosMetricsDimensions(ListVqosMetricsDimensionsQuery query) throws Exception {
        RawResponse rawResponse = json("ListVqosMetricsDimensions", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, ListVqosMetricsDimensionsRes.class);
    }

    /**
     * <p>getVqosRawData</p>
     * <p>通用数据查询接口</p>
     *
     * <p>直播通用数据查询接口</p>
     *
     * @param query query arguments
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public GetVqosRawDataRes getVqosRawData(GetVqosRawDataQuery query, GetVqosRawDataBody body) throws Exception {
        RawResponse rawResponse = json("GetVqosRawData", Utils.paramsToPair(query), JSON.toJSONString(body));
        return parseRawResponse(rawResponse, GetVqosRawDataRes.class);
    }

    /**
     * <p>stopPullCDNSnapshotTask</p>
     * <p>停止直播截图任务</p>
     *
     * <p>调用 StopPullCDNSnapshotTask 接口，停止拉流截图任务。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public StopPullCDNSnapshotTaskRes stopPullCDNSnapshotTask(StopPullCDNSnapshotTaskBody body) throws Exception {
        RawResponse rawResponse = json("StopPullCDNSnapshotTask", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, StopPullCDNSnapshotTaskRes.class);
    }

    /**
     * <p>createPullCDNSnapshotTask</p>
     * <p>创建直播截图任务</p>
     *
     * <p>调用 CreatePullCDNSnapshotTask 接口，创建直播截图任务。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreatePullCDNSnapshotTaskRes createPullCDNSnapshotTask(CreatePullCDNSnapshotTaskBody body) throws Exception {
        RawResponse rawResponse = json("CreatePullCDNSnapshotTask", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreatePullCDNSnapshotTaskRes.class);
    }

    /**
     * <p>getPullCDNSnapshotTask</p>
     * <p>查询单个直播截图任务</p>
     *
     * <p>调用 GetPullCDNSnapshotTask 接口，查询单个直播截图任务的信息。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public GetPullCDNSnapshotTaskRes getPullCDNSnapshotTask(GetPullCDNSnapshotTaskBody body) throws Exception {
        RawResponse rawResponse = json("GetPullCDNSnapshotTask", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, GetPullCDNSnapshotTaskRes.class);
    }

    /**
     * <p>listPullCDNSnapshotTask</p>
     * <p>查询所有直播截图任务</p>
     *
     * <p>调用 ListPullCDNSnapshotTask 接口，查询所有直播截图任务。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ListPullCDNSnapshotTaskRes listPullCDNSnapshotTask(ListPullCDNSnapshotTaskBody body) throws Exception {
        RawResponse rawResponse = json("ListPullCDNSnapshotTask", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ListPullCDNSnapshotTaskRes.class);
    }

    /**
     * <p>getPullRecordTask</p>
     * <p>查询单个直播录制任务</p>
     *
     * <p>调用 GetPullRecordTask 接口，查询单个直播录制任务信息。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public GetPullRecordTaskRes getPullRecordTask(GetPullRecordTaskBody body) throws Exception {
        RawResponse rawResponse = json("GetPullRecordTask", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, GetPullRecordTaskRes.class);
    }

    /**
     * <p>deleteSnapshotAuditPreset</p>
     * <p>删除截图审核配置</p>
     *
     * <p>删除截图审核配置。 </p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>删除截图审核配置不会同步删除相关回调配置。</p>
     *
     * <p>:::</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteSnapshotAuditPresetRes deleteSnapshotAuditPreset(DeleteSnapshotAuditPresetBody body) throws Exception {
        RawResponse rawResponse = json("DeleteSnapshotAuditPreset", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteSnapshotAuditPresetRes.class);
    }

    /**
     * <p>updateSnapshotAuditPreset</p>
     * <p>更新截图审核配置</p>
     *
     * <p>修改截图审核配置。  </p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>调用 [UpdateCallback](https://www.volcengine.com/docs/6469/1126929) 和 [UpdateSnapshotAuditPreset](https://www.volcengine.com/docs/6469/1126869) API，都可以更新截图审核回调配置，当重复调用以上两个接口更新截图审核回调配置时，**以最后一次调用的配置为准**。例如，您先调用 UpdateCallback 为某域名空间下的 App 配置了回调地址`https://live.example.com/callback`，之后调用  UpdateSnapshotAuditPreset 再次对该域名空间下的同一 App 配置了回调地址 `https://live.example.com/callback1`，则最终生效的回调地址为 `https://live.example.com/callback1`。</p>
     *
     * <p>:::</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateSnapshotAuditPresetRes updateSnapshotAuditPreset(UpdateSnapshotAuditPresetBody body) throws Exception {
        RawResponse rawResponse = json("UpdateSnapshotAuditPreset", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateSnapshotAuditPresetRes.class);
    }

    /**
     * <p>describeSnapshotAuditPresetDetail</p>
     * <p>查询截图审核模板详情</p>
     *
     * <p>查询截图审核模板详情</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeSnapshotAuditPresetDetailRes describeSnapshotAuditPresetDetail(DescribeSnapshotAuditPresetDetailBody body) throws Exception {
        RawResponse rawResponse = json("DescribeSnapshotAuditPresetDetail", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeSnapshotAuditPresetDetailRes.class);
    }

    /**
     * <p>listVhostSnapshotAuditPreset</p>
     * <p>查询截图审核配置列表</p>
     *
     * <p>查询截图审核配置。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ListVhostSnapshotAuditPresetRes listVhostSnapshotAuditPreset(ListVhostSnapshotAuditPresetBody body) throws Exception {
        RawResponse rawResponse = json("ListVhostSnapshotAuditPreset", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ListVhostSnapshotAuditPresetRes.class);
    }

    /**
     * <p>createSnapshotAuditPreset</p>
     * <p>添加截图审核配置</p>
     *
     * <p>添加截图审核配置。  </p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>调用 [UpdateCallback](https://www.volcengine.com/docs/6469/1126929) 和 [CreateSnapshotAuditPreset](https://www.volcengine.com/docs/6469/1126867) API，都可以更新截图审核回调配置，当重复调用以上两个接口更新截图审核回调配置时，**以最后一次调用的配置为准**。例如，您先调用 UpdateCallback 为某域名空间下的 App 配置了回调地址`https://live.example.com/callback`，之后调用  CreateSnapshotAuditPreset 再次对该域名空间下的同一 App 配置了回调地址 `https://live.example.com/callback1`，则最终生效的回调地址为 `https://live.example.com/callback1`。</p>
     *
     * <p>:::</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateSnapshotAuditPresetRes createSnapshotAuditPreset(CreateSnapshotAuditPresetBody body) throws Exception {
        RawResponse rawResponse = json("CreateSnapshotAuditPreset", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateSnapshotAuditPresetRes.class);
    }

    /**
     * <p>describeIpInfo</p>
     * <p>查询 IP 地址归属的 CDN 节点</p>
     *
     * <p>本接口用于查询指定 IP 地址是否属于火山引擎 CDN 节点。 </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeIpInfoRes describeIpInfo(DescribeIpInfoBody body) throws Exception {
        RawResponse rawResponse = json("DescribeIpInfo", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeIpInfoRes.class);
    }

    /**
     * <p>describeLiveRegionData</p>
     * <p>查询区域标识符</p>
     *
     * <p>查询用户所在的区域标识符。</p>
     *
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveRegionDataRes describeLiveRegionData() throws Exception {
        RawResponse rawResponse = json("DescribeLiveRegionData", null, "");
        return parseRawResponse(rawResponse, DescribeLiveRegionDataRes.class);
    }

    /**
     * <p>describeLiveSourceStreamMetrics</p>
     * <p>查询单路回源流监控数据</p>
     *
     * <p>支持查询一定时间范围内单路直播回源流的音视频帧率、码率等信息，用于判断回源流的健康程度。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveSourceStreamMetricsRes describeLiveSourceStreamMetrics(DescribeLiveSourceStreamMetricsBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLiveSourceStreamMetrics", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLiveSourceStreamMetricsRes.class);
    }

    /**
     * <p>describeLivePushStreamMetrics</p>
     * <p>查询单路推流监控数据</p>
     *
     * <p>支持查询一定时间范围内单路直播推流的音视频帧率、码率等信息，用于判断直播推流的健康程度。支持查询删除域名的直播推流数据。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLivePushStreamMetricsRes describeLivePushStreamMetrics(DescribeLivePushStreamMetricsBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLivePushStreamMetrics", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLivePushStreamMetricsRes.class);
    }

    /**
     * <p>describeLivePlayStatusCodeData</p>
     * <p>查询域名状态码占比</p>
     *
     * <p>查询一定时间范围内直播拉流请求的状态码占比数据，支持按地区和运营商区分。支持查询删除域名的状态码数据。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLivePlayStatusCodeDataRes describeLivePlayStatusCodeData(DescribeLivePlayStatusCodeDataBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLivePlayStatusCodeData", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLivePlayStatusCodeDataRes.class);
    }

    /**
     * <p>describeLiveBatchSourceStreamMetrics</p>
     * <p>查询多路回源流监控数据</p>
     *
     * <p>支持查询一定时间范围内多路直播回源流的音视频帧率、码率等信息，用于判断回源流的健康程度。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveBatchSourceStreamMetricsRes describeLiveBatchSourceStreamMetrics(DescribeLiveBatchSourceStreamMetricsBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLiveBatchSourceStreamMetrics", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLiveBatchSourceStreamMetricsRes.class);
    }

    /**
     * <p>describeLiveBatchSourceStreamAvgMetrics</p>
     * <p>查询多路回源流监控数据平均值指标</p>
     *
     * <p>支持查询一定时间范围内多路直播回源流的音视频帧率、码率等信息，用于判断回源流的健康程度。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveBatchSourceStreamAvgMetricsRes describeLiveBatchSourceStreamAvgMetrics(DescribeLiveBatchSourceStreamAvgMetricsBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLiveBatchSourceStreamAvgMetrics", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLiveBatchSourceStreamAvgMetricsRes.class);
    }

    /**
     * <p>describeLiveBatchOnlineStreamMetrics</p>
     * <p>查询多路在线流监控数据</p>
     *
     * <p>支持查询直播在线流的音视频帧率、码率等信息，用于判断直播推流的健康程度。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveBatchOnlineStreamMetricsRes describeLiveBatchOnlineStreamMetrics(DescribeLiveBatchOnlineStreamMetricsBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLiveBatchOnlineStreamMetrics", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLiveBatchOnlineStreamMetricsRes.class);
    }

    /**
     * <p>describeLiveBatchPushStreamMetrics</p>
     * <p>查询多路推流监控数据</p>
     *
     * <p>支持查询一定时间范围内指定推流域名下直播推流的音视频帧率、码率等信息，用于判断直播推流的健康程度。支持查询删除域名的直播推流数据。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveBatchPushStreamMetricsRes describeLiveBatchPushStreamMetrics(DescribeLiveBatchPushStreamMetricsBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLiveBatchPushStreamMetrics", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLiveBatchPushStreamMetricsRes.class);
    }

    /**
     * <p>describeLiveBatchPushStreamAvgMetrics</p>
     * <p>查询多路推流监控数据平均值</p>
     *
     * <p>支持查询一定时间范围内指定推流域名下直播推流的音视频帧率、码率等平均值指标，用于判断直播推流的健康程度。支持查询删除域名的直播推流数据。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveBatchPushStreamAvgMetricsRes describeLiveBatchPushStreamAvgMetrics(DescribeLiveBatchPushStreamAvgMetricsBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLiveBatchPushStreamAvgMetrics", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLiveBatchPushStreamAvgMetricsRes.class);
    }

    /**
     * <p>describeLiveBatchStreamTranscodeData</p>
     * <p>查询多路流的转码数据</p>
     *
     * <p>调用接口分页查询指定域名下所有流的转码总量，及每条流的流名、编码格式和转码时长等信息。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveBatchStreamTranscodeDataRes describeLiveBatchStreamTranscodeData(DescribeLiveBatchStreamTranscodeDataBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLiveBatchStreamTranscodeData", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLiveBatchStreamTranscodeDataRes.class);
    }

    /**
     * <p>describeLiveStreamCountData</p>
     * <p>查询峰值流数</p>
     *
     * <p>查询推流、拉流、回源流、转码流的峰值流数。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveStreamCountDataRes describeLiveStreamCountData(DescribeLiveStreamCountDataBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLiveStreamCountData", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLiveStreamCountDataRes.class);
    }

    /**
     * <p>describeLivePushStreamCountData</p>
     * <p>查询推流峰值流数</p>
     *
     * <p>查询推流峰值流数数据。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLivePushStreamCountDataRes describeLivePushStreamCountData(DescribeLivePushStreamCountDataBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLivePushStreamCountData", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLivePushStreamCountDataRes.class);
    }

    /**
     * <p>describeLiveSourceBandwidthData</p>
     * <p>查询直播流或域名的回源带宽监控数据</p>
     *
     * <p>查询一定时间范围内直播拉流或域名的回源带宽监控数据。  </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveSourceBandwidthDataRes describeLiveSourceBandwidthData(DescribeLiveSourceBandwidthDataBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLiveSourceBandwidthData", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLiveSourceBandwidthDataRes.class);
    }

    /**
     * <p>describeLiveSourceTrafficData</p>
     * <p>查询直播流或域名的回源流量监控数据</p>
     *
     * <p>查询一定时间范围内直播拉流或域名的回源流量监控数据。 </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveSourceTrafficDataRes describeLiveSourceTrafficData(DescribeLiveSourceTrafficDataBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLiveSourceTrafficData", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLiveSourceTrafficDataRes.class);
    }

    /**
     * <p>describeLiveMetricBandwidthData</p>
     * <p>查询直播流或域名的带宽监控数据</p>
     *
     * <p>查询一定时间范围内的直播推/拉流或域名的带宽监控数据。支持查询删除域名的带宽数据。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>本接口用于数据监控，数据采集处理方式不同于计费。如需获取对账的带宽用量，请使用 [DescribeLiveBandwidthData](https://www.volcengine.com/docs/6469/1126898)接口。</p>
     *
     * <p>:::</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveMetricBandwidthDataRes describeLiveMetricBandwidthData(DescribeLiveMetricBandwidthDataBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLiveMetricBandwidthData", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLiveMetricBandwidthDataRes.class);
    }

    /**
     * <p>describeLiveMetricTrafficData</p>
     * <p>查询直播流或域名的流量监控数据</p>
     *
     * <p>查询一定时间范围内的直播推/拉流或域名的流量监控数据。支持查询删除域名的流量数据。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>本接口用于数据监控，数据采集处理方式不同于计费。如需获取对账的流量用量，请使用 [DescribeLiveTrafficData](https://www.volcengine.com/docs/6469/1126899)接口。</p>
     *
     * <p>:::</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveMetricTrafficDataRes describeLiveMetricTrafficData(DescribeLiveMetricTrafficDataBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLiveMetricTrafficData", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLiveMetricTrafficDataRes.class);
    }

    /**
     * <p>describeLiveBatchStreamTrafficData</p>
     * <p>查询直播流的流量数据</p>
     *
     * <p>调用接口分页查询指定域名下所有流的上总流量、下行总流量，及每条流的流名、协议和上下行流量等信息。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveBatchStreamTrafficDataRes describeLiveBatchStreamTrafficData(DescribeLiveBatchStreamTrafficDataBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLiveBatchStreamTrafficData", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLiveBatchStreamTrafficDataRes.class);
    }

    /**
     * <p>describeLiveStreamSessionData</p>
     * <p>查询直播流请求数和在线人数</p>
     *
     * <p>支持查询一定时间范围内的直播拉流的在线人数和拉流请求数，支持按拉流协议区分。支持查询删除域名的直播流请求数和在线人数。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveStreamSessionDataRes describeLiveStreamSessionData(DescribeLiveStreamSessionDataBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLiveStreamSessionData", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLiveStreamSessionDataRes.class);
    }

    /**
     * <p>describeLiveISPData</p>
     * <p>查询运营商标识符</p>
     *
     * <p>查询提供网络接入服务的运营商标识符。</p>
     *
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveISPDataRes describeLiveISPData() throws Exception {
        RawResponse rawResponse = json("DescribeLiveISPData", null, "");
        return parseRawResponse(rawResponse, DescribeLiveISPDataRes.class);
    }

    /**
     * <p>describeLiveP95PeakBandwidthData</p>
     * <p>查询 95 带宽峰值</p>
     *
     * <p>支持查询用户账号维度上行和下行的 95 带宽峰值。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveP95PeakBandwidthDataRes describeLiveP95PeakBandwidthData(DescribeLiveP95PeakBandwidthDataBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLiveP95PeakBandwidthData", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLiveP95PeakBandwidthDataRes.class);
    }

    /**
     * <p>describeLiveAuditData</p>
     * <p>查询截图审核用量</p>
     *
     * <p>支持查询用户直播截图审核计量数据。支持按照域名维度（含删除域名）查询，数据按天粒度聚合。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveAuditDataRes describeLiveAuditData(DescribeLiveAuditDataBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLiveAuditData", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLiveAuditDataRes.class);
    }

    /**
     * <p>describeLivePullToPushBandwidthData</p>
     * <p>查询拉流转推带宽用量</p>
     *
     * <p>查询一定时间范围内，直播拉流转推至第三方的带宽用量。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLivePullToPushBandwidthDataRes describeLivePullToPushBandwidthData(DescribeLivePullToPushBandwidthDataBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLivePullToPushBandwidthData", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLivePullToPushBandwidthDataRes.class);
    }

    /**
     * <p>describeLivePullToPushData</p>
     * <p>查询拉流转推时长用量</p>
     *
     * <p>创建拉流转推任务成功后，调用该接口查询拉流转推任务详细，如任务时长等。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLivePullToPushDataRes describeLivePullToPushData(DescribeLivePullToPushDataBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLivePullToPushData", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLivePullToPushDataRes.class);
    }

    /**
     * <p>describeLiveBandwidthData</p>
     * <p>查询直播域名带宽用量</p>
     *
     * <p>查询直播上行、下行（含时移分发）带宽数据。  </p>
     *
     *
     *
     * <p>* 支持按照域名维度（含删除域名）查询；</p>
     *
     * <p>* 支持按照 5 分钟，1 小时和 1 天粒度聚合； </p>
     *
     * <p>* 上行带宽峰值取 BandwidthDataList Up 最大值；</p>
     *
     * <p>* 下行带宽峰值取 BandwidthDataList Down 最大值。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveBandwidthDataRes describeLiveBandwidthData(DescribeLiveBandwidthDataBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLiveBandwidthData", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLiveBandwidthDataRes.class);
    }

    /**
     * <p>describeLiveRecordData</p>
     * <p>查询直播域名录制用量</p>
     *
     * <p>支持按照域名维度（含删除域名）查询录制用量，日录制用量为一个自然日内的录制并发路数峰值。录制用量查询支持 5 分钟、1 小时、1 天和 1 月的粒度聚合。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveRecordDataRes describeLiveRecordData(DescribeLiveRecordDataBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLiveRecordData", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLiveRecordDataRes.class);
    }

    /**
     * <p>describeLiveSnapshotData</p>
     * <p>查询直播域名截图张数</p>
     *
     * <p>支持查询用户直播截图计量数据。支持按照域名维度（含删除域名）查询，数据按天粒度聚合。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveSnapshotDataRes describeLiveSnapshotData(DescribeLiveSnapshotDataBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLiveSnapshotData", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLiveSnapshotDataRes.class);
    }

    /**
     * <p>describeLiveTrafficData</p>
     * <p>查询直播域名流量用量</p>
     *
     * <p>查询直播上行、下行（含时移分发）流量数据。 </p>
     *
     *
     *
     * <p>* 支持按照域名维度（含删除域名）查询；</p>
     *
     * <p>* 支持按照 5 分钟，1 小时和 1 天粒度聚合；</p>
     *
     * <p>* 上行总流量为 TrafficDataList Up 取和；</p>
     *
     * <p>* 下行总流量为 TrafficDataList Down 取和。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveTrafficDataRes describeLiveTrafficData(DescribeLiveTrafficDataBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLiveTrafficData", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLiveTrafficDataRes.class);
    }

    /**
     * <p>describeLiveTranscodeData</p>
     * <p>查询直播域名转码用量</p>
     *
     * <p>支持查询用户直播转码时长数据。支持按照域名维度（含删除域名）查询，按天粒度聚合。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveTranscodeDataRes describeLiveTranscodeData(DescribeLiveTranscodeDataBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLiveTranscodeData", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLiveTranscodeDataRes.class);
    }

    /**
     * <p>describeLiveTimeShiftData</p>
     * <p>查询直播时移存储用量</p>
     *
     * <p>指定时间范围，查询每日直播时移功能的存储用量。  </p>
     *
     *
     *
     * <p>:::warning</p>
     *
     * <p>该接口适用于**视频直播提供时移能力**的场景，如时移文件存储于视频点播 VoD 或对象存储 ToS，请联系我们，获取用量查询方法。</p>
     *
     * <p>:::</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveTimeShiftDataRes describeLiveTimeShiftData(DescribeLiveTimeShiftDataBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLiveTimeShiftData", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLiveTimeShiftDataRes.class);
    }

    /**
     * <p>describeActionHistory</p>
     * <p>查看操作历史详情</p>
     *
     * <p>查看操作历史详情</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeActionHistoryRes describeActionHistory(DescribeActionHistoryBody body) throws Exception {
        RawResponse rawResponse = json("DescribeActionHistory", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeActionHistoryRes.class);
    }

    /**
     * <p>listActionHistory</p>
     * <p>查询操作历史列表</p>
     *
     * <p>查询操作历史列表</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ListActionHistoryRes listActionHistory(ListActionHistoryBody body) throws Exception {
        RawResponse rawResponse = json("ListActionHistory", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ListActionHistoryRes.class);
    }

    /**
     * <p>deleteDenseSnapshotPreset</p>
     * <p>删除密集抽帧截图配置</p>
     *
     * <p>调用接口删除密集抽帧截图配置。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteDenseSnapshotPresetRes deleteDenseSnapshotPreset(DeleteDenseSnapshotPresetBody body) throws Exception {
        RawResponse rawResponse = json("DeleteDenseSnapshotPreset", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteDenseSnapshotPresetRes.class);
    }

    /**
     * <p>updateDenseSnapshotPreset</p>
     * <p>更新密集抽帧截图配置</p>
     *
     * <p>调用接口更新视频直播密集抽帧截图配置。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateDenseSnapshotPresetRes updateDenseSnapshotPreset(UpdateDenseSnapshotPresetBody body) throws Exception {
        RawResponse rawResponse = json("UpdateDenseSnapshotPreset", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateDenseSnapshotPresetRes.class);
    }

    /**
     * <p>listVhostDenseSnapshotPreset</p>
     * <p>查询密集抽帧截图配置</p>
     *
     * <p>查询视频直播密集抽帧截图配置。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ListVhostDenseSnapshotPresetRes listVhostDenseSnapshotPreset(ListVhostDenseSnapshotPresetBody body) throws Exception {
        RawResponse rawResponse = json("ListVhostDenseSnapshotPreset", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ListVhostDenseSnapshotPresetRes.class);
    }

    /**
     * <p>descDenseSnapshotPresetDetail</p>
     * <p>查询密集抽帧配置详情</p>
     *
     * <p>查询密集抽帧配置详情</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescDenseSnapshotPresetDetailRes descDenseSnapshotPresetDetail(DescDenseSnapshotPresetDetailBody body) throws Exception {
        RawResponse rawResponse = json("DescDenseSnapshotPresetDetail", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescDenseSnapshotPresetDetailRes.class);
    }

    /**
     * <p>createDenseSnapshotPreset</p>
     * <p>添加密集抽帧截图配置</p>
     *
     * <p>调用接口添加视频直播密集抽帧截图配置。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateDenseSnapshotPresetRes createDenseSnapshotPreset(CreateDenseSnapshotPresetBody body) throws Exception {
        RawResponse rawResponse = json("CreateDenseSnapshotPreset", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateDenseSnapshotPresetRes.class);
    }

    /**
     * <p>describeLiveCustomizedLogData</p>
     * <p>查询定制化客户日志文件信息</p>
     *
     * <p>查询定制化客户指定域名下、指定日志类型的日志文件下载链接等信息。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveCustomizedLogDataRes describeLiveCustomizedLogData(DescribeLiveCustomizedLogDataBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLiveCustomizedLogData", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLiveCustomizedLogDataRes.class);
    }

    /**
     * <p>describeLiveLogData</p>
     * <p>查询日志文件信息</p>
     *
     * <p>查询指定域名下、指定日志类型的日志文件下载链接等信息。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveLogDataRes describeLiveLogData(DescribeLiveLogDataBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLiveLogData", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLiveLogDataRes.class);
    }

    /**
     * <p>associatePreset</p>
     * <p>关联模板</p>
     *
     * <p>关联模板</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public AssociatePresetRes associatePreset(AssociatePresetBody body) throws Exception {
        RawResponse rawResponse = json("AssociatePreset", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, AssociatePresetRes.class);
    }

    /**
     * <p>disAssociatePreset</p>
     * <p>取消模板关联</p>
     *
     * <p>取消模板关联</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DisAssociatePresetRes disAssociatePreset(DisAssociatePresetBody body) throws Exception {
        RawResponse rawResponse = json("DisAssociatePreset", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DisAssociatePresetRes.class);
    }

    /**
     * <p>updatePresetAssociation</p>
     * <p>更新关联</p>
     *
     * <p>更新关联</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdatePresetAssociationRes updatePresetAssociation(UpdatePresetAssociationBody body) throws Exception {
        RawResponse rawResponse = json("UpdatePresetAssociation", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdatePresetAssociationRes.class);
    }

    /**
     * <p>describePresetAssociation</p>
     * <p>查询模板关联</p>
     *
     * <p>查询模板关联</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribePresetAssociationRes describePresetAssociation(DescribePresetAssociationBody body) throws Exception {
        RawResponse rawResponse = json("DescribePresetAssociation", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribePresetAssociationRes.class);
    }

    /**
     * <p>createTicket</p>
     * <p>创建工单</p>
     *
     * <p>创建工单</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateTicketRes createTicket(CreateTicketBody body) throws Exception {
        RawResponse rawResponse = json("CreateTicket", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateTicketRes.class);
    }

    /**
     * <p>deleteReferer</p>
     * <p>删除 Referer 黑白名单</p>
     *
     * <p>删除 Referer 防盗链配置。 </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteRefererRes deleteReferer(DeleteRefererBody body) throws Exception {
        RawResponse rawResponse = json("DeleteReferer", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteRefererRes.class);
    }

    /**
     * <p>describeDenyConfig</p>
     * <p>查询 IP 黑白名单</p>
     *
     * <p>调用接口查询 IP 黑白名单配置。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeDenyConfigRes describeDenyConfig(DescribeDenyConfigBody body) throws Exception {
        RawResponse rawResponse = json("DescribeDenyConfig", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeDenyConfigRes.class);
    }

    /**
     * <p>describeReferer</p>
     * <p>查询 Referer 黑白名单</p>
     *
     * <p>查询 Referer 防盗链内容。 </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeRefererRes describeReferer(DescribeRefererBody body) throws Exception {
        RawResponse rawResponse = json("DescribeReferer", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeRefererRes.class);
    }

    /**
     * <p>updateDenyConfig</p>
     * <p>添加或更新 IP 黑白名单</p>
     *
     * <p>如果设置黑名单，黑名单中外 IP 会被允许访问。如果设置白名单，白名单中内 IP 允许访问。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateDenyConfigRes updateDenyConfig(UpdateDenyConfigBody body) throws Exception {
        RawResponse rawResponse = json("UpdateDenyConfig", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateDenyConfigRes.class);
    }

    /**
     * <p>updateDenyConfigV2</p>
     * <p>添加或更新 IP 黑白名单</p>
     *
     * <p>为推拉流域名设置 IP 黑白名单。</p>
     *
     *
     *
     * <p>* 黑白名单设置需二选一。</p>
     *
     * <p>* 如果设置黑名单，允许不在黑名单的 `IP` 访问。</p>
     *
     * <p>* 如果设置白名单，允许白名单内的 `IP` 访问。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateDenyConfigV2Res updateDenyConfigV2(UpdateDenyConfigV2Body body) throws Exception {
        RawResponse rawResponse = json("UpdateDenyConfigV2", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateDenyConfigV2Res.class);
    }

    /**
     * <p>updateReferer</p>
     * <p>添加或更新 Referer 黑白名单</p>
     *
     * <p>调用改接口创建Referer 防盗链，或更新 Referer 防盗链配置。 </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateRefererRes updateReferer(UpdateRefererBody body) throws Exception {
        RawResponse rawResponse = json("UpdateReferer", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateRefererRes.class);
    }

    /**
     * <p>updateAuthKey</p>
     * <p>添加或更新推拉流鉴权</p>
     *
     * <p>添加或更新推拉流鉴权信息。更新时，会对所有的鉴权参数做**全量覆盖更新**。</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateAuthKeyRes updateAuthKey(UpdateAuthKeyBody body) throws Exception {
        RawResponse rawResponse = json("UpdateAuthKey", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateAuthKeyRes.class);
    }

    /**
     * <p>deleteRelaySink</p>
     * <p>删除转推配置</p>
     *
     * <p>删除转推配置</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteRelaySinkRes deleteRelaySink(DeleteRelaySinkBody body) throws Exception {
        RawResponse rawResponse = json("DeleteRelaySink", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteRelaySinkRes.class);
    }

    /**
     * <p>updateRelaySink</p>
     * <p>更新转推配置</p>
     *
     * <p>更新转推配置</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateRelaySinkRes updateRelaySink(UpdateRelaySinkBody body) throws Exception {
        RawResponse rawResponse = json("UpdateRelaySink", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateRelaySinkRes.class);
    }

    /**
     * <p>describeRelaySink</p>
     * <p>查询转推配置</p>
     *
     * <p>查询转推配置</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeRelaySinkRes describeRelaySink(DescribeRelaySinkBody body) throws Exception {
        RawResponse rawResponse = json("DescribeRelaySink", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeRelaySinkRes.class);
    }

    /**
     * <p>deleteHLSConfig</p>
     * <p>删除HLS切片配置</p>
     *
     * <p>删除HLS切片配置</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteHLSConfigRes deleteHLSConfig(DeleteHLSConfigBody body) throws Exception {
        RawResponse rawResponse = json("DeleteHLSConfig", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteHLSConfigRes.class);
    }

    /**
     * <p>updateHLSConfig</p>
     * <p>更新HLS切片配置</p>
     *
     * <p>更新HLS切片配置</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateHLSConfigRes updateHLSConfig(UpdateHLSConfigBody body) throws Exception {
        RawResponse rawResponse = json("UpdateHLSConfig", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateHLSConfigRes.class);
    }

    /**
     * <p>describeHLSConfig</p>
     * <p>查询HLS切片配置</p>
     *
     * <p>查询HLS切片配置</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeHLSConfigRes describeHLSConfig(DescribeHLSConfigBody body) throws Exception {
        RawResponse rawResponse = json("DescribeHLSConfig", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeHLSConfigRes.class);
    }

    /**
     * <p>deleteHTTPHeaderConfig</p>
     * <p>删除HTTP Header配置</p>
     *
     * <p>删除HTTP Header配置 </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteHTTPHeaderConfigRes deleteHTTPHeaderConfig(DeleteHTTPHeaderConfigBody body) throws Exception {
        RawResponse rawResponse = json("DeleteHTTPHeaderConfig", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteHTTPHeaderConfigRes.class);
    }

    /**
     * <p>deleteHeaderConfig</p>
     * <p>删除Header配置</p>
     *
     * <p>删除Header配置 </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteHeaderConfigRes deleteHeaderConfig(DeleteHeaderConfigBody body) throws Exception {
        RawResponse rawResponse = json("DeleteHeaderConfig", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteHeaderConfigRes.class);
    }

    /**
     * <p>enableHTTPHeaderConfig</p>
     * <p>启用HTTP Header配置</p>
     *
     * <p>启用Header配置 </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public EnableHTTPHeaderConfigRes enableHTTPHeaderConfig(EnableHTTPHeaderConfigBody body) throws Exception {
        RawResponse rawResponse = json("EnableHTTPHeaderConfig", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, EnableHTTPHeaderConfigRes.class);
    }

    /**
     * <p>updateHTTPHeaderConfig</p>
     * <p>更新HTTP header配置</p>
     *
     * <p>更新HTTP header配置 </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateHTTPHeaderConfigRes updateHTTPHeaderConfig(UpdateHTTPHeaderConfigBody body) throws Exception {
        RawResponse rawResponse = json("UpdateHTTPHeaderConfig", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateHTTPHeaderConfigRes.class);
    }

    /**
     * <p>updateHeaderConfig</p>
     * <p>更新Header配置</p>
     *
     * <p>更新Header配置 </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateHeaderConfigRes updateHeaderConfig(UpdateHeaderConfigBody body) throws Exception {
        RawResponse rawResponse = json("UpdateHeaderConfig", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateHeaderConfigRes.class);
    }

    /**
     * <p>describeHTTPHeaderConfig</p>
     * <p>查询HTTP Header配置</p>
     *
     * <p>查询HTTP Header配置 </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeHTTPHeaderConfigRes describeHTTPHeaderConfig(DescribeHTTPHeaderConfigBody body) throws Exception {
        RawResponse rawResponse = json("DescribeHTTPHeaderConfig", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeHTTPHeaderConfigRes.class);
    }

    /**
     * <p>describeHeaderConfig</p>
     * <p>查询Header配置</p>
     *
     * <p>查询Header配置</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeHeaderConfigRes describeHeaderConfig(DescribeHeaderConfigBody body) throws Exception {
        RawResponse rawResponse = json("DescribeHeaderConfig", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeHeaderConfigRes.class);
    }

    /**
     * <p>listHeaderEnum</p>
     * <p>返回Header 常量变量列表</p>
     *
     * <p>返回Header 常量变量列表 </p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ListHeaderEnumRes listHeaderEnum(ListHeaderEnumBody body) throws Exception {
        RawResponse rawResponse = json("ListHeaderEnum", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ListHeaderEnumRes.class);
    }

    /**
     * <p>deleteNSSRewriteConfig</p>
     * <p>删除配置脚本</p>
     *
     * <p>删除配置脚本</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteNSSRewriteConfigRes deleteNSSRewriteConfig(DeleteNSSRewriteConfigBody body) throws Exception {
        RawResponse rawResponse = json("DeleteNSSRewriteConfig", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteNSSRewriteConfigRes.class);
    }

    /**
     * <p>updateNSSRewriteConfig</p>
     * <p>更新配置脚本</p>
     *
     * <p>更新配置脚本</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateNSSRewriteConfigRes updateNSSRewriteConfig(UpdateNSSRewriteConfigBody body) throws Exception {
        RawResponse rawResponse = json("UpdateNSSRewriteConfig", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateNSSRewriteConfigRes.class);
    }

    /**
     * <p>describeNSSRewriteConfig</p>
     * <p>查询配置脚本</p>
     *
     * <p>查询配置脚本</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeNSSRewriteConfigRes describeNSSRewriteConfig(DescribeNSSRewriteConfigBody body) throws Exception {
        RawResponse rawResponse = json("DescribeNSSRewriteConfig", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeNSSRewriteConfigRes.class);
    }

    /**
     * <p>describeLiveActivityBandwidthData</p>
     * <p>DescribeLiveActivityBandwidthData</p>
     *
     * <p>活动带宽接口</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveActivityBandwidthDataRes describeLiveActivityBandwidthData(DescribeLiveActivityBandwidthDataBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLiveActivityBandwidthData", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLiveActivityBandwidthDataRes.class);
    }

    /**
     * <p>createLiveAccountFeeConfig</p>
     * <p>创建计费相关配置</p>
     *
     * <p>创建和更新计费配置</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateLiveAccountFeeConfigRes createLiveAccountFeeConfig(CreateLiveAccountFeeConfigBody body) throws Exception {
        RawResponse rawResponse = json("CreateLiveAccountFeeConfig", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateLiveAccountFeeConfigRes.class);
    }

    /**
     * <p>deleteLiveAccountFeeConfig</p>
     * <p>删除计费相关配置</p>
     *
     * <p>删除计费配置</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteLiveAccountFeeConfigRes deleteLiveAccountFeeConfig(DeleteLiveAccountFeeConfigBody body) throws Exception {
        RawResponse rawResponse = json("DeleteLiveAccountFeeConfig", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteLiveAccountFeeConfigRes.class);
    }

    /**
     * <p>describeLiveAccountFeeConfig</p>
     * <p>批量获取计费相关配置列表</p>
     *
     * <p>批量获取计费相关配置列表</p>
     *
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveAccountFeeConfigRes describeLiveAccountFeeConfig() throws Exception {
        RawResponse rawResponse = json("DescribeLiveAccountFeeConfig", null, "");
        return parseRawResponse(rawResponse, DescribeLiveAccountFeeConfigRes.class);
    }

    /**
     * <p>describeLiveStreamUsageData</p>
     * <p>查询指定时间流和协议维度的数据</p>
     *
     * <p>查询指定时间流和协议维度的带宽、在线人数和请求数接口</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveStreamUsageDataRes describeLiveStreamUsageData(DescribeLiveStreamUsageDataBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLiveStreamUsageData", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLiveStreamUsageDataRes.class);
    }

    /**
     * <p>describeLiveFeeConfig</p>
     * <p>获取单用户配置信息</p>
     *
     * <p>创建和更新计费配置</p>
     *
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveFeeConfigRes describeLiveFeeConfig() throws Exception {
        RawResponse rawResponse = json("DescribeLiveFeeConfig", null, "");
        return parseRawResponse(rawResponse, DescribeLiveFeeConfigRes.class);
    }

    /**
     * <p>describeLiveAccountFeeType</p>
     * <p>获取计费类型</p>
     *
     * <p>创建和更新计费配置</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLiveAccountFeeTypeRes describeLiveAccountFeeType(DescribeLiveAccountFeeTypeBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLiveAccountFeeType", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLiveAccountFeeTypeRes.class);
    }

    /**
     * <p>updateEncryptDRM</p>
     * <p>更新DRM配置</p>
     *
     * <p>创建/变更DRM配置</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateEncryptDRMRes updateEncryptDRM(UpdateEncryptDRMBody body) throws Exception {
        RawResponse rawResponse = json("UpdateEncryptDRM", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateEncryptDRMRes.class);
    }

    /**
     * <p>describeContentKey</p>
     * <p>获取ContentKey</p>
     *
     * <p>获取ContentKey，提供给NSS调用</p>
     *
     * @return response data
     * @throws Exception error during request
     */
    public DescribeContentKeyRes describeContentKey() throws Exception {
        RawResponse rawResponse = json("DescribeContentKey", null, "");
        return parseRawResponse(rawResponse, DescribeContentKeyRes.class);
    }

    /**
     * <p>describeCertDRM</p>
     * <p>获取可用于DRM加密的FairPlay证书</p>
     *
     * <p>获取FairPlay证书</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public DescribeCertDRMRes describeCertDRM(DescribeCertDRMQuery query) throws Exception {
        RawResponse rawResponse = json("DescribeCertDRM", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, DescribeCertDRMRes.class);
    }

    /**
     * <p>describeLicenseDRM</p>
     * <p>获取标准DRM的License</p>
     *
     * <p>获取标准DRM的License</p>
     *
     * @param query query arguments
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLicenseDRMRes describeLicenseDRM(DescribeLicenseDRMQuery query) throws Exception {
        RawResponse rawResponse = json("DescribeLicenseDRM", Utils.paramsToPair(query), "");
        return parseRawResponse(rawResponse, DescribeLicenseDRMRes.class);
    }

    /**
     * <p>describeEncryptDRM</p>
     * <p>查看DRM配置详情</p>
     *
     * <p>查看DRM详细配置信息</p>
     *
     * @return response data
     * @throws Exception error during request
     */
    public DescribeEncryptDRMRes describeEncryptDRM() throws Exception {
        RawResponse rawResponse = json("DescribeEncryptDRM", null, "");
        return parseRawResponse(rawResponse, DescribeEncryptDRMRes.class);
    }

    /**
     * <p>bindEncryptDRM</p>
     * <p>变更DRM绑定关系</p>
     *
     * <p>变更DRM绑定关系</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public BindEncryptDRMRes bindEncryptDRM(BindEncryptDRMBody body) throws Exception {
        RawResponse rawResponse = json("BindEncryptDRM", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, BindEncryptDRMRes.class);
    }

    /**
     * <p>unBindEncryptDRM</p>
     * <p>解除DRM绑定关系</p>
     *
     * <p>解除DRM的绑定关系</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UnBindEncryptDRMRes unBindEncryptDRM(UnBindEncryptDRMBody body) throws Exception {
        RawResponse rawResponse = json("UnBindEncryptDRM", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UnBindEncryptDRMRes.class);
    }

    /**
     * <p>listBindEncryptDRM</p>
     * <p>查询DRM绑定关系</p>
     *
     * <p>查询DRM绑定关系</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ListBindEncryptDRMRes listBindEncryptDRM(ListBindEncryptDRMBody body) throws Exception {
        RawResponse rawResponse = json("ListBindEncryptDRM", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ListBindEncryptDRMRes.class);
    }

    /**
     * <p>createCustomLogConfig</p>
     * <p>创建日志配置</p>
     *
     * <p>创建日志配置</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateCustomLogConfigRes createCustomLogConfig(CreateCustomLogConfigBody body) throws Exception {
        RawResponse rawResponse = json("CreateCustomLogConfig", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateCustomLogConfigRes.class);
    }

    /**
     * <p>deleteCustomLogConfig</p>
     * <p>删除日志配置</p>
     *
     * <p>删除日志配置</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteCustomLogConfigRes deleteCustomLogConfig(DeleteCustomLogConfigBody body) throws Exception {
        RawResponse rawResponse = json("DeleteCustomLogConfig", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteCustomLogConfigRes.class);
    }

    /**
     * <p>describeCustomLogConfig</p>
     * <p>查询日志配置</p>
     *
     * <p>查询日志配置</p>
     *
     * @return response data
     * @throws Exception error during request
     */
    public DescribeCustomLogConfigRes describeCustomLogConfig() throws Exception {
        RawResponse rawResponse = json("DescribeCustomLogConfig", null, "");
        return parseRawResponse(rawResponse, DescribeCustomLogConfigRes.class);
    }

    /**
     * <p>checkCustomLogConfig</p>
     * <p>校验日志配置</p>
     *
     * <p>校验日志配置</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CheckCustomLogConfigRes checkCustomLogConfig(CheckCustomLogConfigBody body) throws Exception {
        RawResponse rawResponse = json("CheckCustomLogConfig", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CheckCustomLogConfigRes.class);
    }

    /**
     * <p>createTranscodePresetBatch</p>
     * <p>CreateTranscodePresetBatch</p>
     *
     * <p>CreateTranscodePresetBatch 可以将accountid解析出来</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateTranscodePresetBatchRes createTranscodePresetBatch(CreateTranscodePresetBatchBody body) throws Exception {
        RawResponse rawResponse = json("CreateTranscodePresetBatch", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateTranscodePresetBatchRes.class);
    }

    /**
     * <p>deleteTranscodePresetBatch</p>
     * <p>DeleteTranscodePresetBatch</p>
     *
     * <p>更改接口名外放更好</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteTranscodePresetBatchRes deleteTranscodePresetBatch(DeleteTranscodePresetBatchBody body) throws Exception {
        RawResponse rawResponse = json("DeleteTranscodePresetBatch", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteTranscodePresetBatchRes.class);
    }

    /**
     * <p>associateRefConfig</p>
     * <p>关联引用配置</p>
     *
     * <p>关联引用配置</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public AssociateRefConfigRes associateRefConfig(AssociateRefConfigBody body) throws Exception {
        RawResponse rawResponse = json("AssociateRefConfig", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, AssociateRefConfigRes.class);
    }

    /**
     * <p>disassociateRefConfig</p>
     * <p>取消关联引用配置</p>
     *
     * <p>取消关联引用配置</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DisassociateRefConfigRes disassociateRefConfig(DisassociateRefConfigBody body) throws Exception {
        RawResponse rawResponse = json("DisassociateRefConfig", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DisassociateRefConfigRes.class);
    }

    /**
     * <p>describeRefConfig</p>
     * <p>查询引用配置关联</p>
     *
     * <p>查询引用配置关联</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeRefConfigRes describeRefConfig(DescribeRefConfigBody body) throws Exception {
        RawResponse rawResponse = json("DescribeRefConfig", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeRefConfigRes.class);
    }

    /**
     * <p>listReferenceNames</p>
     * <p>查询引用配置名称</p>
     *
     * <p>查询引用配置名称</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ListReferenceNamesRes listReferenceNames(ListReferenceNamesBody body) throws Exception {
        RawResponse rawResponse = json("ListReferenceNames", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ListReferenceNamesRes.class);
    }

    /**
     * <p>listReferenceTypes</p>
     * <p>查询引用配置类型</p>
     *
     * <p>查询引用配置类型</p>
     *
     * @return response data
     * @throws Exception error during request
     */
    public ListReferenceTypesRes listReferenceTypes() throws Exception {
        RawResponse rawResponse = json("ListReferenceTypes", null, "");
        return parseRawResponse(rawResponse, ListReferenceTypesRes.class);
    }

    /**
     * <p>listReferenceInfo</p>
     * <p>查询引用配置详情</p>
     *
     * <p>查询引用配置详情</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ListReferenceInfoRes listReferenceInfo(ListReferenceInfoBody body) throws Exception {
        RawResponse rawResponse = json("ListReferenceInfo", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ListReferenceInfoRes.class);
    }

    /**
     * <p>createAvSlicePreset</p>
     * <p>创建音频切片模板</p>
     *
     * <p>创建音频切片模板</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateAvSlicePresetRes createAvSlicePreset(CreateAvSlicePresetBody body) throws Exception {
        RawResponse rawResponse = json("CreateAvSlicePreset", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateAvSlicePresetRes.class);
    }

    /**
     * <p>deleteAvSlicePreset</p>
     * <p>删除音频切片模板</p>
     *
     * <p>删除音频切片模板</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteAvSlicePresetRes deleteAvSlicePreset(DeleteAvSlicePresetBody body) throws Exception {
        RawResponse rawResponse = json("DeleteAvSlicePreset", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteAvSlicePresetRes.class);
    }

    /**
     * <p>updateAvSlicePreset</p>
     * <p>更新音频切片模板</p>
     *
     * <p>更新音频切片模板</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateAvSlicePresetRes updateAvSlicePreset(UpdateAvSlicePresetBody body) throws Exception {
        RawResponse rawResponse = json("UpdateAvSlicePreset", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateAvSlicePresetRes.class);
    }

    /**
     * <p>deleteIPAccessRule</p>
     * <p>删除ip访问限制</p>
     *
     * <p>更新ip访问限制</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteIPAccessRuleRes deleteIPAccessRule(DeleteIPAccessRuleBody body) throws Exception {
        RawResponse rawResponse = json("DeleteIPAccessRule", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteIPAccessRuleRes.class);
    }

    /**
     * <p>updateIPAccessRule</p>
     * <p>更新ip访问限制</p>
     *
     * <p>更新ip访问限制</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateIPAccessRuleRes updateIPAccessRule(UpdateIPAccessRuleBody body) throws Exception {
        RawResponse rawResponse = json("UpdateIPAccessRule", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateIPAccessRuleRes.class);
    }

    /**
     * <p>describeIPAccessRule</p>
     * <p>查询ip访问限制</p>
     *
     * <p>查询ip访问限制</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeIPAccessRuleRes describeIPAccessRule(DescribeIPAccessRuleBody body) throws Exception {
        RawResponse rawResponse = json("DescribeIPAccessRule", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeIPAccessRuleRes.class);
    }

    /**
     * <p>createProxyConfig</p>
     * <p>创建正向代理</p>
     *
     * <p>创建正向代理</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public CreateProxyConfigRes createProxyConfig(CreateProxyConfigBody body) throws Exception {
        RawResponse rawResponse = json("CreateProxyConfig", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, CreateProxyConfigRes.class);
    }

    /**
     * <p>deleteProxyConfigAssociation</p>
     * <p>删除代理关联</p>
     *
     * <p>删除代理关联</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteProxyConfigAssociationRes deleteProxyConfigAssociation(DeleteProxyConfigAssociationBody body) throws Exception {
        RawResponse rawResponse = json("DeleteProxyConfigAssociation", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteProxyConfigAssociationRes.class);
    }

    /**
     * <p>deleteProxyConfig</p>
     * <p>删除代理配置</p>
     *
     * <p>删除代理配置</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteProxyConfigRes deleteProxyConfig(DeleteProxyConfigBody body) throws Exception {
        RawResponse rawResponse = json("DeleteProxyConfig", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteProxyConfigRes.class);
    }

    /**
     * <p>updateProxyConfigAssociation</p>
     * <p>更新代理关联</p>
     *
     * <p>更新代理关联</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateProxyConfigAssociationRes updateProxyConfigAssociation(UpdateProxyConfigAssociationBody body) throws Exception {
        RawResponse rawResponse = json("UpdateProxyConfigAssociation", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateProxyConfigAssociationRes.class);
    }

    /**
     * <p>updateProxyConfig</p>
     * <p>更新正向代理</p>
     *
     * <p>更新正向代理</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateProxyConfigRes updateProxyConfig(UpdateProxyConfigBody body) throws Exception {
        RawResponse rawResponse = json("UpdateProxyConfig", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateProxyConfigRes.class);
    }

    /**
     * <p>describeProxyConfigAssociation</p>
     * <p>查询代理关联</p>
     *
     * <p>查询代理关联</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeProxyConfigAssociationRes describeProxyConfigAssociation(DescribeProxyConfigAssociationBody body) throws Exception {
        RawResponse rawResponse = json("DescribeProxyConfigAssociation", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeProxyConfigAssociationRes.class);
    }

    /**
     * <p>listProxyConfig</p>
     * <p>查询正向代理配置</p>
     *
     * <p>查询正向代理配置</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public ListProxyConfigRes listProxyConfig(ListProxyConfigBody body) throws Exception {
        RawResponse rawResponse = json("ListProxyConfig", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, ListProxyConfigRes.class);
    }

    /**
     * <p>deleteCMAFConfig</p>
     * <p>删除CMAF切片设置</p>
     *
     * <p>删除CMAF切片设置</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteCMAFConfigRes deleteCMAFConfig(DeleteCMAFConfigBody body) throws Exception {
        RawResponse rawResponse = json("DeleteCMAFConfig", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteCMAFConfigRes.class);
    }

    /**
     * <p>updateCMAFConfig</p>
     * <p>更新CMAF切片设置</p>
     *
     * <p>更新CMAF切片设置</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateCMAFConfigRes updateCMAFConfig(UpdateCMAFConfigBody body) throws Exception {
        RawResponse rawResponse = json("UpdateCMAFConfig", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateCMAFConfigRes.class);
    }

    /**
     * <p>describeCMAFConfig</p>
     * <p>查询CMAF切片设置</p>
     *
     * <p>查询CMAF切片设置</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeCMAFConfigRes describeCMAFConfig(DescribeCMAFConfigBody body) throws Exception {
        RawResponse rawResponse = json("DescribeCMAFConfig", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeCMAFConfigRes.class);
    }

    /**
     * <p>deleteLatencyConfig</p>
     * <p>删除延迟配置</p>
     *
     * <p>删除延迟配置</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DeleteLatencyConfigRes deleteLatencyConfig(DeleteLatencyConfigBody body) throws Exception {
        RawResponse rawResponse = json("DeleteLatencyConfig", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DeleteLatencyConfigRes.class);
    }

    /**
     * <p>updateLatencyConfig</p>
     * <p>延迟配置更新</p>
     *
     * <p>延迟配置更新</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public UpdateLatencyConfigRes updateLatencyConfig(UpdateLatencyConfigBody body) throws Exception {
        RawResponse rawResponse = json("UpdateLatencyConfig", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, UpdateLatencyConfigRes.class);
    }

    /**
     * <p>describeLatencyConfig</p>
     * <p>查询延迟配置</p>
     *
     * <p>查询延迟配置</p>
     *
     * @param body body payload
     * @return response data
     * @throws Exception error during request
     */
    public DescribeLatencyConfigRes describeLatencyConfig(DescribeLatencyConfigBody body) throws Exception {
        RawResponse rawResponse = json("DescribeLatencyConfig", null, JSON.toJSONString(body));
        return parseRawResponse(rawResponse, DescribeLatencyConfigRes.class);
    }

}
