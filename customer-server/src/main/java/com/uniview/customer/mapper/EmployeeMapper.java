package com.uniview.customer.mapper;

import com.uniview.customer.pojo.Employee;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author kurtlee
* @description 针对表【employee(存储员工的基本信息)】的数据库操作Mapper
* @createDate 2024-08-26 17:39:55
* @Entity com.uniview.customer.pojo.Employee
*/
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {

}




