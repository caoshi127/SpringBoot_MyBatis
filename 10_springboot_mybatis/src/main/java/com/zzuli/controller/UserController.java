package com.zzuli.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zzuli.domain.User;
import com.zzuli.service.UserService;
import com.zzuli.utils.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
@Api(tags = "用户管理")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(path = "{id}")
    @ApiOperation("根据id查询用户信息")
    public User getUser(@PathVariable Integer id) {
        return userService.getById(id);
    }

    @GetMapping
    @ApiOperation("获取所有用户信息-GET")
    public List<User> getUserList(PageInfo pageInfo) {
        PageHelper.startPage(pageInfo.getNum(), pageInfo.getSize());
        return userService.getAllUser();
    }

    @PostMapping
    @ApiOperation("添加用户")
    public User add(User user) {
        return userService.addtUser(user);
    }

    @PutMapping
    @ApiOperation("修改用户信息")
    public User edit(User user) {
        userService.updateUser(user);
        return userService.getById(user.getId());
    }

    @DeleteMapping(path = "{id}")
    @ApiOperation("根据id删除用户")
    public User remove(@PathVariable Integer id) {
        User u = userService.getById(id);
        userService.removeById(id);
        return u;
    }



}
