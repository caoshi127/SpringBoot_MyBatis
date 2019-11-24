package com.zzuli;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zzuli.domain.User;
import com.zzuli.mapper.UserMapper;
import com.zzuli.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ApplicationTests {

    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
//        User user = userService.getById(1001);
//        System.out.println(user);

        Page<Object> page = PageHelper.startPage(1, 3);
        List<User> userList = userMapper.findAll();
        for (User user : userList) {
            System.out.println(user);
        }
        System.out.println("总页数: " + page.getTotal());
    }

}
