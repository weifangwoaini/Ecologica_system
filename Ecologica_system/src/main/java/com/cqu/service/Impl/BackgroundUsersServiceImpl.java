package com.cqu.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cqu.dao.BackgroundUsersMapper;
import com.cqu.domain.BackgroundUsers;
import com.cqu.service.BackgroundUsersService;
import org.springframework.stereotype.Service;

@Service
public class BackgroundUsersServiceImpl extends ServiceImpl<BackgroundUsersMapper, BackgroundUsers> implements BackgroundUsersService {
}
