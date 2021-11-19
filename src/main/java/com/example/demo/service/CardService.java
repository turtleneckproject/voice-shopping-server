package com.example.demo.service;


import com.example.demo.dto.CardVO;
import com.example.demo.repository.CardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CardService {
    private final CardRepository cardRepository;

    public int cardcheck(String userid){
        if(cardRepository.existsByUserid(userid))return 1;
        else return -1;
    }

    public void cardregister(CardVO cardVO){
        cardRepository.save(cardVO);
    }

    public List showcard(String userid){
        return cardRepository.findByUserid(userid);
    }
}
