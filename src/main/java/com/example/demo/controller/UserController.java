package com.example.demo.controller;

import com.example.demo.dto.UserVO;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


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

    @GetMapping("/register/check")
    int checkId(@RequestParam String checkid){
        return userService.check(checkid);
    }

    @GetMapping("user/showinfo")
    UserVO showinfo(@RequestParam String userid){
        return userService.showuserinfo(userid);
    }

    @GetMapping("user/cleardb")
    int cleardb(@RequestParam int flag){
        return userService.cleardb(flag);
    }
}
