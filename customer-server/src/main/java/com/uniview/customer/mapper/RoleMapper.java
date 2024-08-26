package com.uniview.customer.mapper;

import com.uniview.customer.pojo.Role;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author kurtlee
* @description 针对表【role(存储员工的角色信息)】的数据库操作Mapper
* @createDate 2024-08-26 17:39:55
* @Entity com.uniview.customer.pojo.Role
*/
@Mapper
public interface RoleMapper extends BaseMapper<Role> {

}




