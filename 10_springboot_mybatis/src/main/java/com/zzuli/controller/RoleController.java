package com.zzuli.controller;

import com.github.pagehelper.PageHelper;
import com.zzuli.domain.Role;
import com.zzuli.service.RoleService;
import com.zzuli.utils.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "角色管理")
@RestController
@RequestMapping("role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping
    @ApiOperation("获取所有角色信息-GET")
    public List<Role> allRoles(PageInfo pageInfo) {
        PageHelper.startPage(pageInfo.getNum(), pageInfo.getSize());
        return roleService.getAllRoles();
    }


    @PostMapping
    @ApiOperation("新增角色")
    public Role add(@RequestBody Role role) {
        return roleService.addRole(role);
    }

    @PutMapping
    @ApiOperation("修改角色信息")
    public Role edit(@RequestBody Role role) {
        roleService.updateRole(role);
        return roleService.getById(role.getId());
    }

    @DeleteMapping(path = "{id}")
    @ApiOperation("删除角色")
    public Role remove(@PathVariable Integer id) {
        Role r = roleService.getById(id);
        roleService.removeById(id);
        return r;
    }

}
