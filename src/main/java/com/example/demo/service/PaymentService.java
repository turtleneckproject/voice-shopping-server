package com.example.demo.service;


import com.example.demo.dto.BasketVO;
import com.example.demo.dto.PaymentVO;
import com.example.demo.repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final PaymentRepository paymentRepository;

    public void pluspayment(List<PaymentVO> newitems){                             // 결제목록에 아이템 추가
            paymentRepository.saveAll(newitems);
        }

    public List<PaymentVO> showpayment(String customer){                                      // 해당 회원의 결제목록 반환
        return paymentRepository.findByCustomer(customer);
    }
}
