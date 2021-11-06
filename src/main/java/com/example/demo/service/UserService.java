package com.example.demo.service;


import com.example.demo.dto.UserVO;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    public int register(UserVO userVO){             //회원가입
        UserVO temp = new UserVO();

        temp.setId(userVO.getId());
        temp.setPwd(userVO.getPwd());


        if(userRepository.existsById(userVO.getId())){
            System.out.println("중복된아이디");
            return -1;
        }else{
            userRepository.save(temp);
            System.out.println("회원가입성공");
            return 1;
        }
    }
}
