package com.uniview.customer.mapper;

import com.uniview.customer.pojo.CustomerApproval;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author kurtlee
* @description 针对表【customer_approval(客户审批表)】的数据库操作Mapper
* @createDate 2024-08-26 17:15:13
* @Entity com.uniview.customer.pojo.CustomerApproval
*/
@Mapper
public interface CustomerApprovalMapper extends BaseMapper<CustomerApproval> {

}




