package com.uniview.product.mapper;

import com.uniview.product.pojo.OrderItem;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author kurtlee
* @description 针对表【order_item(订单项表)】的数据库操作Mapper
* @createDate 2024-08-26 17:20:38
* @Entity com.uniview.product.pojo.OrderItem
*/
@Mapper
public interface OrderItemMapper extends BaseMapper<OrderItem> {

}




