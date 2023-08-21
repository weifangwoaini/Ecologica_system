package com.cqu.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class IndicatorsAnalysisResult {
    @TableId(value = "indicators_analysis_result_id",type = IdType.AUTO)
    private Integer indicatorsAnalysisResultId;
    private String indicatorsAnalysisResuntName;
    private String indicatorsAnalysisResultDescription;
    private Integer indicatorsAnalysisTaskId;
    private Integer indicatorsAnalysisResultDataSourceId;
    private Integer indicatorsAnalysisAreaDataSourceId;
    private String timeSpend;
    private String area;
    private String patchesNumber;
    private String isApplicationCase;
    private String deleted;
    private String createdBy;
    private String createdTime;
    private String updateBy;
    private String updateTime;

    public IndicatorsAnalysisResult(Integer indicatorsAnalysisResultId, String indicatorsAnalysisResuntName, String indicatorsAnalysisResultDescription, Integer indicatorsAnalysisTaskId, Integer indicatorsAnalysisResultDataSourceId, Integer indicatorsAnalysisAreaDataSourceId, String timeSpend, String area, String patchesNumber, String isApplicationCase, String deleted, String createdBy, String createdTime, String updateBy, String updateTime) {
        this.indicatorsAnalysisResultId = indicatorsAnalysisResultId;
        this.indicatorsAnalysisResuntName = indicatorsAnalysisResuntName;
        this.indicatorsAnalysisResultDescription = indicatorsAnalysisResultDescription;
        this.indicatorsAnalysisTaskId = indicatorsAnalysisTaskId;
        this.indicatorsAnalysisResultDataSourceId = indicatorsAnalysisResultDataSourceId;
        this.indicatorsAnalysisAreaDataSourceId = indicatorsAnalysisAreaDataSourceId;
        this.timeSpend = timeSpend;
        this.area = area;
        this.patchesNumber = patchesNumber;
        this.isApplicationCase = isApplicationCase;
        this.deleted = deleted;
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.updateBy = updateBy;
        this.updateTime = updateTime;
    }

    public IndicatorsAnalysisResult() {
    }
}
