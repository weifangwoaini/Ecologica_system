package com.cqu.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class ChangeAnalysisResult {
    @TableId(value = "change_analysis_result_id",type = IdType.AUTO)
    private Integer changeAnalysisResultId;
    private String changeAnalysisResultName;
    private String changeAnalysisResultDescription;
    private Integer analysisTaskId;
    private Integer analysisResultDataSourceId;
    private String timeSpend;
    private String area;
    private String patchesNumber;
    private String isApplicationCase;
    private String deleted;
    private String createdBy;
    private String createdTime;
    private String updateBy;
    private String updateTime;

    public ChangeAnalysisResult(Integer changeAnalysisResultId, String changeAnalysisResultName, String changeAnalysisResultDescription, Integer analysisTaskId, Integer analysisResultDataSourceId, String timeSpend, String area, String patchesNumber, String isApplicationCase, String deleted, String createdBy, String createdTime, String updateBy, String updateTime) {
        this.changeAnalysisResultId = changeAnalysisResultId;
        this.changeAnalysisResultName = changeAnalysisResultName;
        this.changeAnalysisResultDescription = changeAnalysisResultDescription;
        this.analysisTaskId = analysisTaskId;
        this.analysisResultDataSourceId = analysisResultDataSourceId;
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

    public ChangeAnalysisResult() {
    }
}
