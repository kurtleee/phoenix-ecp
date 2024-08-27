package com.uniview.order.controller;

import com.uniview.order.pojo.Order;
import com.uniview.order.service.OrderService;
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
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public boolean createOrder(@RequestBody Order order) {
        return orderService.save(order);
    }

    @PutMapping("/{id}")
    public boolean updateOrder(@PathVariable Long id, @RequestBody Order order) {
        order.setOrderId(id);
        return orderService.updateById(order);
    }

    @DeleteMapping("/{id}")
    public boolean deleteOrder(@PathVariable Long id) {
        return orderService.removeById(id);
    }

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable Long id) {
        return orderService.getById(id);
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.list();
    }

    @GetMapping("/page")
    public IPage<Order> getOrdersPage(@RequestParam int pageNo, @RequestParam int pageSize) {
        Page<Order> page = new Page<>(pageNo, pageSize);
        QueryWrapper<Order> queryWrapper = new QueryWrapper<>();
        return orderService.page(page, queryWrapper);
    }
}
