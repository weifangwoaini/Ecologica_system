package com.cqu.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class ClassificationResult {
    @TableId(value = "classification_result_id",type = IdType.AUTO)
    private Integer classificationResultId;
    private String classificationResultName;
    private String classificationResultDescription;
    private Integer classificationTaskId;
    private Integer classificationResultDataSourceId;
    private Integer imageDataSourceId;
    private String coordinatesDefault;
    private String coordinatesRange;
    private String extractionType;
    private String isApplicationCase;
    private String deleted;
    private String createdBy;
    private String createdTime;
    private String updateBy;
    private String updateTime;

    public ClassificationResult(Integer classificationResultId, String classificationResultName, String classificationResultDescription, Integer classificationTaskId, Integer classificationResultDataSourceId, Integer imageDataSourceId, String coordinatesDefault, String coordinatesRange, String extractionType, String isApplicationCase, String deleted, String createdBy, String createdTime, String updateBy, String updateTime) {
        this.classificationResultId = classificationResultId;
        this.classificationResultName = classificationResultName;
        this.classificationResultDescription = classificationResultDescription;
        this.classificationTaskId = classificationTaskId;
        this.classificationResultDataSourceId = classificationResultDataSourceId;
        this.imageDataSourceId = imageDataSourceId;
        this.coordinatesDefault = coordinatesDefault;
        this.coordinatesRange = coordinatesRange;
        this.extractionType = extractionType;
        this.isApplicationCase = isApplicationCase;
        this.deleted = deleted;
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.updateBy = updateBy;
        this.updateTime = updateTime;
    }

    public ClassificationResult() {
    }
}
