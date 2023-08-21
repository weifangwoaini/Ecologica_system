package com.cqu.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cqu.dao.SpatialRefSysMapper;
import com.cqu.domain.SpatialRefSys;
import com.cqu.service.SpatialRefSysService;
import org.springframework.stereotype.Service;

@Service
public class SpatialRefSysServiceImpl extends ServiceImpl<SpatialRefSysMapper, SpatialRefSys> implements SpatialRefSysService {
}
