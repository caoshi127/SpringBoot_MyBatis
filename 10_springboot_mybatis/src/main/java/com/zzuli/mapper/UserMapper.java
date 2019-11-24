package com.zzuli.mapper;

import com.zzuli.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {

    @Select("select * from t_user where id = #{id}")
    User findById(Integer id);

    @Select("select * from t_user")
    List<User> findAll();

    @Options(useGeneratedKeys = true, keyProperty = "id")       // 插入后获取主键, 指定主键属性名
    @Insert("insert into t_user values (default, #{userName}, #{gender}, #{address}, #{roleId})")
    int insertUser(User user);

    @Update("update t_user " +
            "set userName = #{userName}, gender = #{gender}, address = #{address}, roleId = #{roleId} " +
            "where id = #{id}")
    int updateUser(User user);

    @Delete("delete from t_user where id = #{id}")
    int deleteById(Integer id);

}
