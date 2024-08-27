package com.uniview.customer.controller;

import com.uniview.customer.pojo.Employee;
import com.uniview.customer.service.EmployeeService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by @Kurt LEE. Last Modified on 2024/8/27, 上午10:03.
 */
@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Integer id) {
        return employeeService.getById(id);
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.list();
    }

    @PostMapping
    public boolean createEmployee(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }

    @PutMapping("/{id}")
    public boolean updateEmployee(@PathVariable Integer id, @RequestBody Employee employee) {
        employee.setId(id);
        return employeeService.updateById(employee);
    }

    @DeleteMapping("/{id}")
    public boolean deleteEmployee(@PathVariable Integer id) {
        return employeeService.removeById(id);
    }

    @GetMapping("/page")
    public Page<Employee> getEmployeePage(@RequestParam int pageNo, @RequestParam int pageSize) {
        return employeeService.page(new Page<>(pageNo, pageSize));
    }
}