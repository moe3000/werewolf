package com.yclee.werewolf.modules.system.controller;

import com.yclee.werewolf.modules.system.domain.User;
import com.yclee.werewolf.modules.system.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/user/{id}")
    public ResponseEntity getUsers(@PathVariable("id") Long id) {
        User user = userService.queryById(id);
        return new ResponseEntity(user, HttpStatus.OK);
    }

    @PostMapping("/user")
    public ResponseEntity insert(@RequestBody User user) {
        int num = userService.insert(user);
        return new ResponseEntity(user, HttpStatus.OK);
    }


}
