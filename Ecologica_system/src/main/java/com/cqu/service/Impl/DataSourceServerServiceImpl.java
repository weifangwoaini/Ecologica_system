package com.cqu.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cqu.dao.DataSourceServerMapper;
import com.cqu.domain.DataSourceServer;
import com.cqu.service.DataSourceServerService;
import org.springframework.stereotype.Service;

@Service
public class DataSourceServerServiceImpl extends ServiceImpl<DataSourceServerMapper, DataSourceServer> implements DataSourceServerService {
}
