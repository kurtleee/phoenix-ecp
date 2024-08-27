package com.uniview.customer.controller;

import com.uniview.customer.pojo.Role;
import com.uniview.customer.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by @Kurt LEE. Last Modified on 2024/8/27, 上午10:03.
 */
@RestController
@RequestMapping("/roles")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping("/{id}")
    public Role getRoleById(@PathVariable Integer id) {
        return roleService.getById(id);
    }

    @GetMapping
    public List<Role> getAllRoles() {
        return roleService.list();
    }

    @PostMapping
    public boolean createRole(@RequestBody Role role) {
        return roleService.save(role);
    }

    @PutMapping("/{id}")
    public boolean updateRole(@PathVariable Integer id, @RequestBody Role role) {
        role.setId(id);
        return roleService.updateById(role);
    }

    @DeleteMapping("/{id}")
    public boolean deleteRole(@PathVariable Integer id) {
        return roleService.removeById(id);
    }
}