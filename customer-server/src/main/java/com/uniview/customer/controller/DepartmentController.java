package com.uniview.customer.controller;

import com.uniview.customer.pojo.Department;
import com.uniview.customer.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by @Kurt LEE. Last Modified on 2024/8/27, 上午10:03.
 */
@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable Integer id) {
        return departmentService.getById(id);
    }

    @GetMapping
    public List<Department> getAllDepartments() {
        return departmentService.list();
    }

    @PostMapping
    public boolean createDepartment(@RequestBody Department department) {
        return departmentService.save(department);
    }

    @PutMapping("/{id}")
    public boolean updateDepartment(@PathVariable Integer id, @RequestBody Department department) {
        department.setId(id);
        return departmentService.updateById(department);
    }

    @DeleteMapping("/{id}")
    public boolean deleteDepartment(@PathVariable Integer id) {
        return departmentService.removeById(id);
    }
}