package com.cqu.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class ChangeAnalysisTask {
    @TableId(value = "change_analysis_task_id",type = IdType.AUTO)
    private Integer changeAnalysisTaskId;
    private String analysisTaskName;
    private Integer indicatorsAnalysisResultDataSourceIds;
    private Integer classificationAreaDataSourceId;
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

    public ChangeAnalysisTask(Integer changeAnalysisTaskId, String analysisTaskName, Integer indicatorsAnalysisResultDataSourceIds, Integer classificationAreaDataSourceId, String currentProgress, String expectedResultName, String expectedResultDescription, String isResultShare, String isProgressPush, String deleted, String createdBy, String createdTime, String updateBy, String updateTime) {
        this.changeAnalysisTaskId = changeAnalysisTaskId;
        this.analysisTaskName = analysisTaskName;
        this.indicatorsAnalysisResultDataSourceIds = indicatorsAnalysisResultDataSourceIds;
        this.classificationAreaDataSourceId = classificationAreaDataSourceId;
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

    public ChangeAnalysisTask() {
    }
}
