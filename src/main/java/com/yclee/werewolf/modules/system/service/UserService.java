package com.yclee.werewolf.modules.system.service;

import com.yclee.werewolf.modules.system.domain.User;

public interface UserService {

    User queryById(Long id);

    int insert(User user);

}
