package com.uniview.customer.controller;

import com.uniview.customer.pojo.Customer;
import com.uniview.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by @Kurt LEE. Last Modified on 2024/8/27, 上午10:03.
 */
@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id) {
        return customerService.getById(id);
    }

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.list();
    }

    @PostMapping
    public boolean createCustomer(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

    @PutMapping("/{id}")
    public boolean updateCustomer(@PathVariable Long id, @RequestBody Customer customer) {
        customer.setCustomerId(id);
        return customerService.updateById(customer);
    }

    @DeleteMapping("/{id}")
    public boolean deleteCustomer(@PathVariable Long id) {
        return customerService.removeById(id);
    }
}