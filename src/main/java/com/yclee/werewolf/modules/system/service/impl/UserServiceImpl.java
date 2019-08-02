package com.yclee.werewolf.modules.system.service.impl;

import com.yclee.werewolf.modules.system.domain.User;
import com.yclee.werewolf.modules.system.mapper.UserMapper;
import com.yclee.werewolf.modules.system.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User queryById(Long id) {
        return userMapper.queryById(id);
    }

    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }
}
