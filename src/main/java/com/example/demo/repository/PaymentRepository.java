package com.example.demo.repository;

import com.example.demo.dto.PaymentVO;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentRepository extends JpaRepository<PaymentVO, String> {

    List<PaymentVO> findByCustomer(String customer);
}
