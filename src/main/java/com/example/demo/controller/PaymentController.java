package com.example.demo.controller;


import com.example.demo.dto.BasketVO;
import com.example.demo.dto.PaymentVO;
import com.example.demo.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RequiredArgsConstructor
@RestController
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @PostMapping("/payment/plusitem")                                    // 결제목록에 추가
    int plusitem(@RequestBody List<PaymentVO> newitems){
        return paymentService.pluspayment(newitems);
    }

    @GetMapping("/payment/showpayment")                                   // 결제 목록 반환
    List<PaymentVO> showbasket(@RequestParam String customer){
        return paymentService.showpayment(customer);
    }
}
