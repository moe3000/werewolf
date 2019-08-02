package com.yclee.werewolf.modules.system.mapper;

import com.yclee.werewolf.modules.system.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from sys_user where id = #{id}")
    User queryById(@Param("id") Long id);

    int insert(User user);

}
