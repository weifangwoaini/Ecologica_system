package com.cqu.common;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理器
 */

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)   //目前暂定捕获所有异常
    public R ex(Exception ex){
        ex.printStackTrace();
        return R.error("对不起,操作失败,请联系管理员");
    }



}
