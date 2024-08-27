package com.uniview.customer.controller;

import com.uniview.customer.pojo.CustomerApproval;
import com.uniview.customer.service.CustomerApprovalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by @Kurt LEE. Last Modified on 2024/8/27, 上午10:03.
 */
@RestController
@RequestMapping("/customer-approvals")
public class CustomerApprovalController {

    @Autowired
    private CustomerApprovalService customerApprovalService;

    @GetMapping("/{id}")
    public CustomerApproval getCustomerApprovalById(@PathVariable Long id) {
        return customerApprovalService.getById(id);
    }

    @GetMapping
    public List<CustomerApproval> getAllCustomerApprovals() {
        return customerApprovalService.list();
    }

    @PostMapping
    public boolean createCustomerApproval(@RequestBody CustomerApproval customerApproval) {
        return customerApprovalService.save(customerApproval);
    }

    @PutMapping("/{id}")
    public boolean updateCustomerApproval(@PathVariable Long id, @RequestBody CustomerApproval customerApproval) {
        customerApproval.setApprovalId(id);
        return customerApprovalService.updateById(customerApproval);
    }

    @DeleteMapping("/{id}")
    public boolean deleteCustomerApproval(@PathVariable Long id) {
        return customerApprovalService.removeById(id);
    }
}