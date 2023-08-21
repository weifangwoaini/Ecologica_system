package com.cqu.controller;

import com.cqu.common.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@ResponseBody
public class LoginController {

    //TODO
    @PostMapping("/login")
    public R login(){
        return null;
    }



}
