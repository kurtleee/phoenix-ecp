package com.uniview.product.mapper;

import com.uniview.product.pojo.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author kurtlee
* @description 针对表【order(订单表)】的数据库操作Mapper
* @createDate 2024-08-26 17:20:38
* @Entity com.uniview.product.pojo.Order
*/
@Mapper
public interface OrderMapper extends BaseMapper<Order> {

}




