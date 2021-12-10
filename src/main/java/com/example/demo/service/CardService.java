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

    public int cardregister(CardVO cardVO){
        cardRepository.save(cardVO);
        return 1;
    }

    public List showcard(String userid){
        return cardRepository.findByUserid(userid);
    }

    public String getcardpwd(String userid, String cardcompany){
        if(cardRepository.existsByUseridAndCardcompany(userid, cardcompany)){
            CardVO tempcard = cardRepository.findCardVOByUseridAndCardcompany(userid, cardcompany);
            return tempcard.getPwd();
        }else return null;
    }

    public int cleardb(int flag){
        if(flag==1)cardRepository.deleteAllInBatch();
        return 1;
    }
}
