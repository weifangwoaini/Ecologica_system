package com.cqu.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.cqu.common.R;
import com.cqu.domain.BackgroundUsers;
import com.cqu.service.BackgroundUsersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
@ResponseBody
@RequestMapping
public class LoginController {
    @Autowired
    private BackgroundUsersService backgroundUsersService;

    /**
     *      登录功能
     * @param request
     * @param backgroundUsers
     * @return
     */
    @PostMapping("/login")
    public R<BackgroundUsers> login(HttpServletRequest request, @RequestBody BackgroundUsers backgroundUsers){
        //1.将页面提交的密码进行md5加密
        String password = backgroundUsers.getPassword();
        password = DigestUtils.md5DigestAsHex(password.getBytes())+"\n";

        //2.根据页面提交的用户名username查询数据库
        LambdaQueryWrapper<BackgroundUsers> queryWrapper= new LambdaQueryWrapper<>();
       queryWrapper.eq(BackgroundUsers::getUsername,backgroundUsers.getUsername());
        BackgroundUsers emp = backgroundUsersService.getOne(queryWrapper);

        //3.如果没有查询到username,表示没有此用户,此时返回登录失败
        if(emp == null){
            return R.error("此账号不存在");
        }

        //4.密码对比,如果不一致则返回登录失败结果
        if(!emp.getPassword().equals(password)){
            return R.error("密码错误");
        }

        //5. 查看员工状态,如果为已禁用状态,则返回此员工已禁用
        if(emp.getStatus() == 0){
            return R.error("此账号已禁用,请联系管理员");
        }

        //6. 以上五个步骤均无错误说明账号密码正确,且此账号没有被禁用,可以正常登录
            request.getSession().setAttribute("backgroundUsers",emp.getId());
        return R.success(emp);
    }


    /**
     * 退出登录功能
     */
    @PostMapping("/logout")
    public R<String> logout(HttpServletRequest request){
        //清理session中保存的当前登录员工的id
        request.getSession().removeAttribute("backgroundUsers");
        return R.success("退出登陆成功");
    }





}
