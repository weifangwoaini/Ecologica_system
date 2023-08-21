package com.cqu.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class AlarmResultDetail {
    @TableId(value = "alarm_result_detail_id",type = IdType.AUTO)
    private Integer alarmResultDetailId;
    private Integer alarmResultId;
    private String indicatorValue;
    private String parameterThreshold;
    private String deleted;
    private String createdBy;
    private String createdTime;
    private String updateBy;
    private String updateTime;

    public AlarmResultDetail(Integer alarmResultDetailId, Integer alarmResultId, String indicatorValue, String parameterThreshold, String deleted, String createdBy, String createdTime, String updateBy, String updateTime) {
        this.alarmResultDetailId = alarmResultDetailId;
        this.alarmResultId = alarmResultId;
        this.indicatorValue = indicatorValue;
        this.parameterThreshold = parameterThreshold;
        this.deleted = deleted;
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.updateBy = updateBy;
        this.updateTime = updateTime;
    }

    public AlarmResultDetail() {
    }
}
