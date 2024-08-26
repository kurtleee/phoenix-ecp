package com.uniview.customer.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.uniview.customer.pojo.Employee;
import com.uniview.customer.service.EmployeeService;
import com.uniview.customer.mapper.EmployeeMapper;
import org.springframework.stereotype.Service;

/**
* @author kurtlee
* @description 针对表【employee(存储员工的基本信息)】的数据库操作Service实现
* @createDate 2024-08-26 17:39:55
*/
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee>
    implements EmployeeService{

}




