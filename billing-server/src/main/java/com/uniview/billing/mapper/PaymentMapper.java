package com.uniview.billing.mapper;

import com.uniview.billing.pojo.Payment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author kurtlee
* @description 针对表【payment(支付表)】的数据库操作Mapper
* @createDate 2024-08-26 17:28:13
* @Entity com.uniview.billing.pojo.Payment
*/
@Mapper
public interface PaymentMapper extends BaseMapper<Payment> {

}




