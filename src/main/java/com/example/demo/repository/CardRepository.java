package com.example.demo.repository;

import com.example.demo.dto.CardVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardRepository extends JpaRepository<CardVO, String> {

    List<CardVO> findByUserid(String userid);

    boolean existsByUserid(String userid);
}
