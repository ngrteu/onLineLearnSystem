package com.learn.System.learning.service.impl;

import com.learn.System.learning.entity.Role;
import com.learn.System.learning.mapper.RoleMapper;
import com.learn.System.learning.service.RoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 身份表 服务实现类
 * </p>
 *
 * @author whc
 * @since 2021-04-13
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

}
