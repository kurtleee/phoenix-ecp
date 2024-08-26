package com.uniview.customer.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.uniview.customer.pojo.Role;
import com.uniview.customer.service.RoleService;
import com.uniview.customer.mapper.RoleMapper;
import org.springframework.stereotype.Service;

/**
* @author kurtlee
* @description 针对表【role(存储员工的角色信息)】的数据库操作Service实现
* @createDate 2024-08-26 17:39:55
*/
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role>
    implements RoleService{

}




