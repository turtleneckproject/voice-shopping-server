package com.example.demo.controller;

import com.example.demo.dto.BasketVO;
import com.example.demo.dto.CardVO;
import com.example.demo.service.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RequiredArgsConstructor
@RestController
public class CardController {

    @Autowired
    CardService cardService;

    @GetMapping("/card/checkcard")
    int check(@RequestParam String userid){
        return cardService.cardcheck(userid);
    }

    @PostMapping("/card/pluscard")
    void plus(@RequestBody CardVO newcard){
        cardService.cardregister(newcard);
    }

    @GetMapping("/card/showcard")
    List<BasketVO> show(@RequestParam String userid){
        return cardService.showcard(userid);
    }

    @GetMapping("/card/cleardb")
    int cleardb(@RequestParam int flag){
        return cardService.cleardb(flag);
    }
}
