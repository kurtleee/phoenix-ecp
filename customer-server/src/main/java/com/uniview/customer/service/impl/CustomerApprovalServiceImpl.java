package com.uniview.customer.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.uniview.customer.pojo.CustomerApproval;
import com.uniview.customer.service.CustomerApprovalService;
import com.uniview.customer.mapper.CustomerApprovalMapper;
import org.springframework.stereotype.Service;

/**
* @author kurtlee
* @description 针对表【customer_approval(客户审批表)】的数据库操作Service实现
* @createDate 2024-08-26 17:15:13
*/
@Service
public class CustomerApprovalServiceImpl extends ServiceImpl<CustomerApprovalMapper, CustomerApproval>
    implements CustomerApprovalService{

}




