package com.cqu.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class IndicatorsAnalysisResultDetail {
    @TableId(value = "indicators_analysis_result_detail_id",type = IdType.AUTO)
    private Integer indicatorsAnalysisResultDetailId;
    private Integer indicatorsAnalysisResultId;
    private String ecologicalType;
    private String area;
    private String proportion;
    private String averagePatchArea;
    private String boundaryDensity;
    private String aggregationIndex;
    private String deleted;
    private String createdBy;
    private String createdTime;
    private String updateBy;
    private String updateTime;

    public IndicatorsAnalysisResultDetail(Integer indicatorsAnalysisResultDetailId, Integer indicatorsAnalysisResultId, String ecologicalType, String area, String proportion, String averagePatchArea, String boundaryDensity, String aggregationIndex, String deleted, String createdBy, String createdTime, String updateBy, String updateTime) {
        this.indicatorsAnalysisResultDetailId = indicatorsAnalysisResultDetailId;
        this.indicatorsAnalysisResultId = indicatorsAnalysisResultId;
        this.ecologicalType = ecologicalType;
        this.area = area;
        this.proportion = proportion;
        this.averagePatchArea = averagePatchArea;
        this.boundaryDensity = boundaryDensity;
        this.aggregationIndex = aggregationIndex;
        this.deleted = deleted;
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.updateBy = updateBy;
        this.updateTime = updateTime;
    }

    public IndicatorsAnalysisResultDetail() {
    }
}
