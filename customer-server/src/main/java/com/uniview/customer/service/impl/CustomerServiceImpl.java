package com.uniview.customer.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.uniview.customer.pojo.Customer;
import com.uniview.customer.service.CustomerService;
import com.uniview.customer.mapper.CustomerMapper;
import org.springframework.stereotype.Service;

/**
* @author kurtlee
* @description 针对表【customer(客户表)】的数据库操作Service实现
* @createDate 2024-08-26 17:15:13
*/
@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer>
    implements CustomerService{

}




