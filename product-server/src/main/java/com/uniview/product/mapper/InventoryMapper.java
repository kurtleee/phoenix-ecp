package com.uniview.product.mapper;

import com.uniview.product.pojo.Inventory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author kurtlee
* @description 针对表【inventory(库存表)】的数据库操作Mapper
* @createDate 2024-08-26 17:25:10
* @Entity com.uniview.product.pojo.Inventory
*/
@Mapper
public interface InventoryMapper extends BaseMapper<Inventory> {

}



