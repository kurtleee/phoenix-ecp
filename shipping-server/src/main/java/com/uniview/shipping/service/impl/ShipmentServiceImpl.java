package com.uniview.shipping.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.uniview.shipping.pojo.Shipment;
import com.uniview.shipping.service.ShipmentService;
import com.uniview.shipping.mapper.ShipmentMapper;
import org.springframework.stereotype.Service;

/**
* @author kurtlee
* @description 针对表【shipment(发货表)】的数据库操作Service实现
* @createDate 2024-08-26 17:34:18
*/
@Service
public class ShipmentServiceImpl extends ServiceImpl<ShipmentMapper, Shipment>
    implements ShipmentService{

}




