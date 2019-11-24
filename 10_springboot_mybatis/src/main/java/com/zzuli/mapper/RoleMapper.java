package com.zzuli.mapper;

import com.zzuli.domain.Role;

import java.util.List;

public interface RoleMapper {

    /**
     * 查询所有角色信息
     * @return  list<Role>
     */
    List<Role> findAll();

    /**
     * 根据id查询角色信息
     * @param id ID
     * @return  Role
     */
    Role findById(Integer id);

    /**
     * 添加角色
     * @param role role
     * @return
     */
    int insertRole(Role role);

    /**
     * 修改角色信息
     * @param role
     * @return
     */
    int updateRole(Role role);

    /**
     * 根据id删除角色
     * @param id
     * @return
     */
    int deleteById(Integer id);


}
