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
    int plus(@RequestBody CardVO newcard){
        return cardService.cardregister(newcard);
    }

    @GetMapping("/card/showcard")
    List<BasketVO> show(@RequestParam String userid){
        return cardService.showcard(userid);
    }

    @GetMapping("/card/checkpwd")
    int checkpwd(@RequestParam String userid, @RequestParam int index, @RequestParam char input, @RequestParam String cardcompany){
        String temppwd = cardService.getcardpwd(userid, cardcompany);
        if(temppwd == null)return -1;

        if(temppwd.charAt(index-1) == input)return 1;
        else return -1;
    }

    @GetMapping("/card/cleardb")
    int cleardb(@RequestParam int flag){
        return cardService.cleardb(flag);
    }
}
