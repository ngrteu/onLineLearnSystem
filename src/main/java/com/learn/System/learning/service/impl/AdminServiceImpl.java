package com.learn.System.learning.service.impl;

import com.learn.System.learning.entity.Admin;
import com.learn.System.learning.mapper.AdminMapper;
import com.learn.System.learning.service.AdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 管理员表 服务实现类
 * </p>
 *
 * @author whc
 * @since 2021-04-13
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

}
