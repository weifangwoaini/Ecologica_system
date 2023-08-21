package com.cqu.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class AlarmTask {

    @TableId(value = "alarm_task_id",type = IdType.AUTO)
    private Integer alarmTaskId;
    private String alarmTaskName;
    private String alarmTaskType;
    private Integer alarmDataSourceIds;
    private String alarmParameterThreshold;
    private String currentProgress;
    private String expectedResultName;
    private String expectedResultDescription;
    private String isResultShare;
    private String isProgressPush;
    private String deleted;
    private String createdBy;
    private String createdTime;
    private String updatedBy;
    private String updatedTime;


    public AlarmTask(Integer alarmTaskId, String alarmTaskName, String alarmTaskType, Integer alarmDataSourceIds, String alarmParameterThreshold, String currentProgress, String expectedResultName, String expectedResultDescription, String isResultShare, String isProgressPush, String deleted, String createdBy, String createdTime, String updateBy, String updateTime) {
        this.alarmTaskId = alarmTaskId;
        this.alarmTaskName = alarmTaskName;
        this.alarmTaskType = alarmTaskType;
        this.alarmDataSourceIds = alarmDataSourceIds;
        this.alarmParameterThreshold = alarmParameterThreshold;
        this.currentProgress = currentProgress;
        this.expectedResultName = expectedResultName;
        this.expectedResultDescription = expectedResultDescription;
        this.isResultShare = isResultShare;
        this.isProgressPush = isProgressPush;
        this.deleted = deleted;
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.updatedBy = updateBy;
        this.updatedTime = updateTime;
    }

    public AlarmTask() {
    }
}
