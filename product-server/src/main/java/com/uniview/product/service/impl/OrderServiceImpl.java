package com.uniview.product.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.uniview.product.pojo.Order;
import com.uniview.product.service.OrderService;
import com.uniview.product.mapper.OrderMapper;
import org.springframework.stereotype.Service;

/**
* @author kurtlee
* @description 针对表【order(订单表)】的数据库操作Service实现
* @createDate 2024-08-26 17:20:38
*/
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order>
    implements OrderService{

}




