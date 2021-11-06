package com.example.demo.controller;


import com.example.demo.dto.UserVO;
import com.example.demo.service.LoginService;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RequiredArgsConstructor
@RestController
public class LoginController {

    @Autowired
    LoginService loginService;

    @GetMapping("/login")
    String insertUser(@RequestParam String userid){

        return loginService.login(userid);
    }
}
