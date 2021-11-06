package com.example.demo.service;

import com.example.demo.dto.UserVO;
import com.example.demo.repository.LoginRepository;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class LoginService {
    private final LoginRepository loginRepository;

    public String login(String userid){
        UserVO tempuser = new UserVO();
        tempuser = loginRepository.findById(userid).get();

        return tempuser.getPwd();
    }
}
