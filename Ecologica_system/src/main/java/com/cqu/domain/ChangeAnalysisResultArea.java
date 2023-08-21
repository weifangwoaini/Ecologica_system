package com.cqu.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class ChangeAnalysisResultArea {
    @TableId(value = "change_analysis_result_area_id",type = IdType.AUTO)
    private Integer changeAnalysisResultAreaId;
    private Integer changeAnalysisResultId;
    private String ecologicalType;
    private String variation;
    private String proportion;
    private String patchesNumberChange;
    private String averagePatchAreaChange;
    private String boundaryDensityChange;
    private String aggregationIndexChange;
    private String deleted;
    private String createdBy;
    private String createdTime;
    private String updateBy;
    private String updateTime;

    public ChangeAnalysisResultArea(Integer changeAnalysisResultAreaId, Integer changeAnalysisResultId, String ecologicalType, String variation, String proportion, String patchesNumberChange, String averagePatchAreaChange, String boundaryDensityChange, String aggregationIndexChange, String deleted, String createdBy, String createdTime, String updateBy, String updateTime) {
        this.changeAnalysisResultAreaId = changeAnalysisResultAreaId;
        this.changeAnalysisResultId = changeAnalysisResultId;
        this.ecologicalType = ecologicalType;
        this.variation = variation;
        this.proportion = proportion;
        this.patchesNumberChange = patchesNumberChange;
        this.averagePatchAreaChange = averagePatchAreaChange;
        this.boundaryDensityChange = boundaryDensityChange;
        this.aggregationIndexChange = aggregationIndexChange;
        this.deleted = deleted;
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.updateBy = updateBy;
        this.updateTime = updateTime;
    }

    public ChangeAnalysisResultArea() {
    }
}
