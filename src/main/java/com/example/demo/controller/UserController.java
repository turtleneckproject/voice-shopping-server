package com.example.demo.controller;

import com.example.demo.dto.UserVO;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin("*")
@RequiredArgsConstructor
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/register")
    int insertUser(@RequestBody UserVO user){

        String ID = user.getId();
        //String PWD = user.getPwd();

        System.out.println(ID);
        return userService.register(user);
    }
}
