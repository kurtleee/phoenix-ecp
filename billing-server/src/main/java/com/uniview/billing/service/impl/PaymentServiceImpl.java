package com.uniview.billing.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.uniview.billing.pojo.Payment;
import com.uniview.billing.service.PaymentService;
import com.uniview.billing.mapper.PaymentMapper;
import org.springframework.stereotype.Service;

/**
* @author kurtlee
* @description 针对表【payment(支付表)】的数据库操作Service实现
* @createDate 2024-08-26 17:28:13
*/
@Service
public class PaymentServiceImpl extends ServiceImpl<PaymentMapper, Payment>
    implements PaymentService{

}




