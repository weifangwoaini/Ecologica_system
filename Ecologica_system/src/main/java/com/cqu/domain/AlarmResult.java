package com.cqu.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class AlarmResult {

    @TableId(value = "alarm_result_id",type = IdType.AUTO)  //MybatisPlus无法完成对此数据库主键的识别,所以我们手动设置
    private Integer alarmResultId;

    private String alarmResultName;
    private String alarmResultDescription;
    private Integer alarmTaskId;
    private String timeSpend;
    private String area;
    private String isApplicationCase;
    private String deleted;
    private String createdBy;
    private String createdTime;
    private String updatedBy;
    private String updatedTime;

    public AlarmResult(Integer alarmResultId, String alarmResultName, String alarmResultDescription, Integer alarmTaskId, String timeSpend, String area, String isApplicationCase, String deleted, String createdBy, String createdTime, String updatedBy, String updatedTime) {
        this.alarmResultId = alarmResultId;
        this.alarmResultName = alarmResultName;
        this.alarmResultDescription = alarmResultDescription;
        this.alarmTaskId = alarmTaskId;
        this.timeSpend = timeSpend;
        this.area = area;
        this.isApplicationCase = isApplicationCase;
        this.deleted = deleted;
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.updatedBy = updatedBy;
        this.updatedTime = updatedTime;
    }

    public AlarmResult() {
    }
}
