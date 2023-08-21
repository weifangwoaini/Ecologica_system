package com.cqu.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class DataSourceServer {
    @TableId(value = "data_source_id",type = IdType.AUTO)
    private Integer dataSourceId;
    private String location;
    private String timePhase;
    private String dataSourceServerUrl;
    private String drawnRangeCoordinates;
    private String dataSourceType;
    private String createdBy;
    private String createdTime;
    private String updateBy;
    private String updateTime;

    public DataSourceServer(Integer dataSourceId, String location, String timePhase, String dataSourceServerUrl, String drawnRangeCoordinates, String dataSourceType, String createdBy, String createdTime, String updateBy, String updateTime) {
        this.dataSourceId = dataSourceId;
        this.location = location;
        this.timePhase = timePhase;
        this.dataSourceServerUrl = dataSourceServerUrl;
        this.drawnRangeCoordinates = drawnRangeCoordinates;
        this.dataSourceType = dataSourceType;
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.updateBy = updateBy;
        this.updateTime = updateTime;
    }

    public DataSourceServer() {
    }
}
