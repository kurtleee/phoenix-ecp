package com.uniview.product.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.uniview.product.pojo.Product;
import com.uniview.product.service.ProductService;
import com.uniview.product.mapper.ProductMapper;
import org.springframework.stereotype.Service;

/**
* @author kurtlee
* @description 针对表【product(产品表)】的数据库操作Service实现
* @createDate 2024-08-26 17:25:10
*/
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product>
    implements ProductService{

}




