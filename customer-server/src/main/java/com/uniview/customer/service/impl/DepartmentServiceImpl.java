package com.uniview.customer.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.uniview.customer.pojo.Department;
import com.uniview.customer.service.DepartmentService;
import com.uniview.customer.mapper.DepartmentMapper;
import org.springframework.stereotype.Service;

/**
* @author kurtlee
* @description 针对表【department(存储组织部门信息)】的数据库操作Service实现
* @createDate 2024-08-26 17:39:55
*/
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department>
    implements DepartmentService{

}




