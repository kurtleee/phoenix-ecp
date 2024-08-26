package com.uniview.billing.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.uniview.billing.pojo.Invoice;
import com.uniview.billing.service.InvoiceService;
import com.uniview.billing.mapper.InvoiceMapper;
import org.springframework.stereotype.Service;

/**
* @author kurtlee
* @description 针对表【invoice(发票表)】的数据库操作Service实现
* @createDate 2024-08-26 17:28:13
*/
@Service
public class InvoiceServiceImpl extends ServiceImpl<InvoiceMapper, Invoice>
    implements InvoiceService{

}




