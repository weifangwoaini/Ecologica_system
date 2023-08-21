package com.cqu.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class SpatialRefSys {
    @TableId(value = "srid",type = IdType.AUTO)
    private String srid;
    private String authName;
    private String authSrid;
    private String srtext;
    private String proj4text;

    public SpatialRefSys(String srid, String authName, String authSrid, String srtext, String proj4text) {
        this.srid = srid;
        this.authName = authName;
        this.authSrid = authSrid;
        this.srtext = srtext;
        this.proj4text = proj4text;
    }

    public SpatialRefSys() {
    }
}
