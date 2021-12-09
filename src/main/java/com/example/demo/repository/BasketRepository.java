package com.example.demo.repository;

import com.example.demo.dto.BasketVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BasketRepository extends JpaRepository<BasketVO, String> {

    List<BasketVO> findByCustomer(String customer);
    int deleteAllByCustomer(String customer);
    int deleteByRowid(int rowid);
    boolean existsByCustomer(String customer);
    boolean existsByRowid(int rowid);

}
