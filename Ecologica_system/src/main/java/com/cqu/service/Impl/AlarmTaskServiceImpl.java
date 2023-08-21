package com.cqu.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cqu.dao.AlarmTaskMapper;
import com.cqu.domain.AlarmTask;
import com.cqu.service.AlarmTaskService;
import org.springframework.stereotype.Service;

@Service
public class AlarmTaskServiceImpl extends ServiceImpl<AlarmTaskMapper, AlarmTask> implements AlarmTaskService {
}
