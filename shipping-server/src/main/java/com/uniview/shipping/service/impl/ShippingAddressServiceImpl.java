package com.uniview.shipping.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.uniview.shipping.pojo.ShippingAddress;
import com.uniview.shipping.service.ShippingAddressService;
import com.uniview.shipping.mapper.ShippingAddressMapper;
import org.springframework.stereotype.Service;

/**
* @author kurtlee
* @description 针对表【shipping_address(收货地址表)】的数据库操作Service实现
* @createDate 2024-08-26 17:34:18
*/
@Service
public class ShippingAddressServiceImpl extends ServiceImpl<ShippingAddressMapper, ShippingAddress>
    implements ShippingAddressService{

}




