package com.zzuli.service;

import com.zzuli.domain.Role;

import java.util.List;

public interface RoleService {
    /**
     * 查询所有角色信息
     * @return
     */
    List<Role> getAllRoles();

    /**
     * 根据id查询角色信息
     * @param id 要查询角色的id
     * @return
     */
    Role getById(Integer id);

    /**
     * 添加角色
     * @param role 新增的role
     * @return  行数
     */
    Role addRole(Role role);

    /**
     * 修改角色信息
     * @param role 修改后的role
     * @return 行数
     */
    int updateRole(Role role);


    /**
     * 根据id移除角色
     * @param id 要移除角色的id
     * @return  行数
     */
    int removeById(Integer id);


}
