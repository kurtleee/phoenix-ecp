package com.uniview.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.uniview.order.pojo.OrderItem;
import com.uniview.order.service.OrderItemService;
import com.uniview.order.mapper.OrderItemMapper;
import org.springframework.stereotype.Service;

/**
* @author kurtlee
* @description 针对表【order_item(订单项表)】的数据库操作Service实现
* @createDate 2024-08-26 17:26:28
*/
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem>
    implements OrderItemService{

}




