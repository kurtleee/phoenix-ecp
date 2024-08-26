package com.uniview.customer.mapper;

import com.uniview.customer.pojo.Customer;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author kurtlee
* @description 针对表【customer(客户表)】的数据库操作Mapper
* @createDate 2024-08-26 17:15:13
* @Entity com.uniview.customer.pojo.Customer
*/
@Mapper
public interface CustomerMapper extends BaseMapper<Customer> {

}




