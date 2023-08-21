package com.cqu.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cqu.dao.AlarmResultDetailMapper;
import com.cqu.domain.AlarmResultDetail;
import com.cqu.service.AlarmResultDetailService;
import org.springframework.stereotype.Service;

@Service
public class AlarmResultDetailServiceImpl extends ServiceImpl<AlarmResultDetailMapper, AlarmResultDetail> implements AlarmResultDetailService {
}
