package com.example.demo.repository;

import com.example.demo.dto.UserVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface UserRepository extends JpaRepository<UserVO, String> {
}
