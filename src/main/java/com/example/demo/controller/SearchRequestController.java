package com.example.demo.controller;


import com.example.demo.dto.ItemDto;
import com.example.demo.utils.NaverShopSearch;
import lombok.RequiredArgsConstructor;
import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class SearchRequestController {
    private final NaverShopSearch naverShopSearch;

    @GetMapping("/api/item")
    public List<ItemDto> getItems(@RequestParam String keyword){
        String resultString = naverShopSearch.search(keyword);
        System.out.println(keyword);
        return naverShopSearch.fromJSONtoItems(resultString);
    }
}
