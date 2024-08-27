package com.uniview.order.controller;

import com.uniview.order.pojo.OrderItem;
import com.uniview.order.service.OrderItemService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by @Kurt LEE. Last Modified on 2024/8/27, 上午10:43.
 */
@RestController
@RequestMapping("/order-items")
public class OrderItemController {

    @Autowired
    private OrderItemService orderItemService;

    @PostMapping
    public boolean createOrderItem(@RequestBody OrderItem orderItem) {
        return orderItemService.save(orderItem);
    }

    @PutMapping("/{id}")
    public boolean updateOrderItem(@PathVariable Long id, @RequestBody OrderItem orderItem) {
        orderItem.setOrderItemId(id);
        return orderItemService.updateById(orderItem);
    }

    @DeleteMapping("/{id}")
    public boolean deleteOrderItem(@PathVariable Long id) {
        return orderItemService.removeById(id);
    }

    @GetMapping("/{id}")
    public OrderItem getOrderItemById(@PathVariable Long id) {
        return orderItemService.getById(id);
    }

    @GetMapping
    public List<OrderItem> getAllOrderItems() {
        return orderItemService.list();
    }

    @GetMapping("/page")
    public IPage<OrderItem> getOrderItemsPage(@RequestParam int pageNo, @RequestParam int pageSize) {
        Page<OrderItem> page = new Page<>(pageNo, pageSize);
        QueryWrapper<OrderItem> queryWrapper = new QueryWrapper<>();
        return orderItemService.page(page, queryWrapper);
    }
}
