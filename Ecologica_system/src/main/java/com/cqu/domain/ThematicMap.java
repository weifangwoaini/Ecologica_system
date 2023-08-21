package com.cqu.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class ThematicMap {
    @TableId(value = "change_analysis_result_area_id",type = IdType.AUTO)
    private Integer changeAnalysisResultAreaId;
    private Integer changeAnalysisResultId;
    private String thematicMapName;
    private String thematicMapType;
    private String thematicMapUrl;
    private String parameter;
    private String deleted;
    private String createdBy;
    private String createdTime;
    private String updateBy;
    private String updateTime;

    public ThematicMap(Integer changeAnalysisResultAreaId, Integer changeAnalysisResultId, String thematicMapName, String thematicMapType, String thematicMapUrl, String parameter, String deleted, String createdBy, String createdTime, String updateBy, String updateTime) {
        this.changeAnalysisResultAreaId = changeAnalysisResultAreaId;
        this.changeAnalysisResultId = changeAnalysisResultId;
        this.thematicMapName = thematicMapName;
        this.thematicMapType = thematicMapType;
        this.thematicMapUrl = thematicMapUrl;
        this.parameter = parameter;
        this.deleted = deleted;
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.updateBy = updateBy;
        this.updateTime = updateTime;
    }

    public ThematicMap() {
    }
}
