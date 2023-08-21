package com.cqu.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cqu.dao.AlarmResultMapper;
import com.cqu.domain.AlarmResult;
import com.cqu.service.AlarmResultService;
import org.springframework.stereotype.Service;

@Service
public class AlarmResultServiceImpl extends ServiceImpl<AlarmResultMapper, AlarmResult> implements AlarmResultService {
}
