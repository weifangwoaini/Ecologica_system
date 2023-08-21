package com.cqu.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class IndicatorsAnalysisTask {
    @TableId(value = "indicators_analysis_task_id",type = IdType.AUTO)
    private Integer indicatorsAnalysisTaskId;
    private String indicatorsAnalysisTaskName;
    private Integer classificationAreaDataSourceId;
    private Integer indicatorsAnalysisAreaDataSourceId;
    private String currentProgress;
    private String expectedResultName;
    private String expectedResultDescription;
    private String isResultShare;
    private String isProgressPush;
    private String deleted;
    private String createdBy;
    private String createdTime;
    private String updateBy;
    private String updateTime;

    public IndicatorsAnalysisTask(Integer indicatorsAnalysisTaskId, String indicatorsAnalysisTaskName, Integer classificationAreaDataSourceId, Integer indicatorsAnalysisAreaDataSourceId, String currentProgress, String expectedResultName, String expectedResultDescription, String isResultShare, String isProgressPush, String deleted, String createdBy, String createdTime, String updateBy, String updateTime) {
        this.indicatorsAnalysisTaskId = indicatorsAnalysisTaskId;
        this.indicatorsAnalysisTaskName = indicatorsAnalysisTaskName;
        this.classificationAreaDataSourceId = classificationAreaDataSourceId;
        this.indicatorsAnalysisAreaDataSourceId = indicatorsAnalysisAreaDataSourceId;
        this.currentProgress = currentProgress;
        this.expectedResultName = expectedResultName;
        this.expectedResultDescription = expectedResultDescription;
        this.isResultShare = isResultShare;
        this.isProgressPush = isProgressPush;
        this.deleted = deleted;
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.updateBy = updateBy;
        this.updateTime = updateTime;
    }

    public IndicatorsAnalysisTask() {
    }
}
