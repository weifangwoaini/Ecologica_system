package com.cqu.controller;

import com.cqu.common.R;
import com.cqu.domain.AlarmTask;
import com.cqu.service.AlarmTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class AlarmController {
    @Autowired
    private AlarmTaskService alarmTaskService;

    //这只是一次测试代码
    @GetMapping("/alarm/{alarmTaskId}")
    public R getAllById(@PathVariable Integer alarmTaskId){
        return R.success(alarmTaskService.getById(alarmTaskId));
    }
}
