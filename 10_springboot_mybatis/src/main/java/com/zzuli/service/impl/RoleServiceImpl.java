package com.zzuli.service.impl;

import com.zzuli.domain.Role;
import com.zzuli.mapper.RoleMapper;
import com.zzuli.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Role> getAllRoles() {
        return roleMapper.findAll();
    }

    @Override
    public Role getById(Integer id) {
        return roleMapper.findById(id);
    }

    @Override
    public Role addRole(Role role) {
        roleMapper.insertRole(role);
        return roleMapper.findById(role.getId());
    }

    @Override
    public int updateRole(Role role) {
        return roleMapper.updateRole(role);
    }

    @Override
    public int removeById(Integer id) {
        return roleMapper.deleteById(id);
    }
}
