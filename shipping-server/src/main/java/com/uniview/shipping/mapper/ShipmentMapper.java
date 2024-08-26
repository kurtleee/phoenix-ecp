package com.uniview.shipping.mapper;

import com.uniview.shipping.pojo.Shipment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author kurtlee
* @description 针对表【shipment(发货表)】的数据库操作Mapper
* @createDate 2024-08-26 17:34:18
* @Entity com.uniview.shipping.pojo.Shipment
*/
@Mapper
public interface ShipmentMapper extends BaseMapper<Shipment> {

}




