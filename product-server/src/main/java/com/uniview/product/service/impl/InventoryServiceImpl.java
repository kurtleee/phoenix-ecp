package com.uniview.product.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.uniview.product.pojo.Inventory;
import com.uniview.product.service.InventoryService;
import com.uniview.product.mapper.InventoryMapper;
import org.springframework.stereotype.Service;

/**
* @author kurtlee
* @description 针对表【inventory(库存表)】的数据库操作Service实现
* @createDate 2024-08-26 17:25:10
*/
@Service
public class InventoryServiceImpl extends ServiceImpl<InventoryMapper, Inventory>
    implements InventoryService{

}




