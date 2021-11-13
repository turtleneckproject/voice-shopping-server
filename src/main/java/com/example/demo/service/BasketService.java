package com.example.demo.service;


import com.example.demo.dto.BasketVO;
import com.example.demo.repository.BasketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BasketService {
    private final BasketRepository basketRepository;

    public void plusitem(BasketVO newitem){                             // 장바구니에 아이템 추가

        BasketVO temp = new BasketVO();
        temp.setCustomer(newitem.getCustomer());
        temp.setTitle(newitem.getTitle());
        temp.setImage(newitem.getImage());
        temp.setPrice(newitem.getPrice());
        temp.setPid(newitem.getPid());
        temp.setNum(newitem.getNum());
        temp.setRowid(newitem.getRowid());
        basketRepository.save(temp);
    }

    public List showbasket(String customer){                              // 해당 회원의 장바구니 목록 반환
        return basketRepository.findByCustomer(customer);
    }
}
