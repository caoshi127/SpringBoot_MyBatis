package com.zzuli.service;

import com.zzuli.domain.User;

import java.util.List;


public interface UserService {

    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    User getById(Integer id);

    /**
     * 查询所有用户信息
     * @return
     */
    List<User> getAllUser();

    /**
     * 修改用户信息
     * @param user
     * @return
     */
    int updateUser(User user);

    /**
     * 添加用户
     * @param user
     * @return
     */
    User addtUser(User user);

    /**
     * 根据id删除用户
     * @param id
     * @return
     */
    int removeById(Integer id);

}
