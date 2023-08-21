package com.cqu.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class ClassificationTask {

    @TableId(value = "classification_task_id",type = IdType.AUTO)
    private Integer classificationTaskId;
    private String classificationTaskName;
    private String classificationMethod;
    private String currentProgress;
    private String taskDescription;
    private Integer classificationAreaDataSourceId;
    private Integer classificationImageDataSourceId;
    private String expectedExtractionType;
    private String expectedResultName;
    private String expectedResultDescription;
    private String isResultShare;
    private String isProgressPush;
    private String deleted;
    private String createdBy;
    private String createdTime;
    private String updateBy;
    private String updateTime;

    public ClassificationTask(Integer classificationTaskId, String classificationTaskName, String classificationMethod, String currentProgress, String taskDescription, Integer classificationAreaDataSourceId, Integer classificationImageDataSourceId, String expectedExtractionType, String expectedResultName, String expectedResultDescription, String isResultShare, String isProgressPush, String deleted, String createdBy, String createdTime, String updateBy, String updateTime) {
        this.classificationTaskId = classificationTaskId;
        this.classificationTaskName = classificationTaskName;
        this.classificationMethod = classificationMethod;
        this.currentProgress = currentProgress;
        this.taskDescription = taskDescription;
        this.classificationAreaDataSourceId = classificationAreaDataSourceId;
        this.classificationImageDataSourceId = classificationImageDataSourceId;
        this.expectedExtractionType = expectedExtractionType;
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

    public ClassificationTask() {
    }
}
