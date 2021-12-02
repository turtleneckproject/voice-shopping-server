package com.example.demo.controller;

import com.example.demo.dto.BasketVO;
import com.example.demo.service.BasketService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RequiredArgsConstructor
@RestController
public class BasketController {

    @Autowired
    BasketService basketService;

    @PostMapping("/basket/plusitem")                                    // 장바구니에 추가
    int plus(@RequestBody BasketVO newitem){
        return basketService.plusitem(newitem);
    }

    @GetMapping("/basket/showbasket")                                   // 장바구니 목록 반환
    List<BasketVO> show(@RequestParam String customer){
        return basketService.showbasket(customer);
    }

    @GetMapping("/basket/deleteall")
    int deleteall(@RequestParam String customer){
       return basketService.deleteall(customer);
    }

    @GetMapping("/basket/deleteone")
    int deleteone(@RequestParam int rowid){
        return basketService.deleteone(rowid);
    }
}
