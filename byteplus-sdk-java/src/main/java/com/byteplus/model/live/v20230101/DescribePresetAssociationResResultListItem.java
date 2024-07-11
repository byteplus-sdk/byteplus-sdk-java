package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribePresetAssociationResResultListItem
 */
@lombok.Data
public final class DescribePresetAssociationResResultListItem  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RecordPresetListV2")
    private List<DescribePresetAssociationResResultListItemRecordPresetListV2Item> recordPresetListV2;

    /**
     * <p>转码配置列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TransPresetList")
    private List<DescribePresetAssociationResResultListItemTransPresetListItem> transPresetList;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CdnSnapshotPresetListV2")
    private List<DescribePresetAssociationResResultListItemCdnSnapshotPresetListV2Item> cdnSnapshotPresetListV2;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeshiftPresetListV2")
    private List<DescribePresetAssociationResResultListItemTimeshiftPresetListV2Item> timeshiftPresetListV2;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AvextractorPresetListV2")
    private List<DescribePresetAssociationResResultListItemAvextractorPresetListV2Item> avextractorPresetListV2;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "WatermarkPresetListV2")
    private List<DescribePresetAssociationResResultListItemWatermarkPresetListV2Item> watermarkPresetListV2;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SnapshotAuditPresetListV2")
    private List<DescribePresetAssociationResResultListItemSnapshotAuditPresetListV2Item> snapshotAuditPresetListV2;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AvslicePresetListV2")
    private List<DescribePresetAssociationResResultListItemAvslicePresetListV2Item> avslicePresetListV2;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SnapshotPresetListV2")
    private List<DescribePresetAssociationResResultListItemSnapshotPresetListV2Item> snapshotPresetListV2;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DataMigrationPresetListV2")
    private List<DescribePresetAssociationResResultListItemDataMigrationPresetListV2Item> dataMigrationPresetListV2;

    /**
     * <p>智能转码列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LiveDynamicTransStrategyList")
    private List<DescribePresetAssociationResResultListItemLiveDynamicTransStrategyListItem> liveDynamicTransStrategyList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
