package com.zzuli.service.impl;

import com.zzuli.domain.User;
import com.zzuli.mapper.UserMapper;
import com.zzuli.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public User getById(Integer id) {
        return userMapper.findById(id);
    }

    @Override
    public List<User> getAllUser() {
        return userMapper.findAll();
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public User addtUser(User user) {
        userMapper.insertUser(user);
        return userMapper.findById(user.getId());
    }

    @Override
    public int removeById(Integer id) {
        return userMapper.deleteById(id);
    }
}
