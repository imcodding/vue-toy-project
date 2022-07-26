package com.shopping.contoller;

import com.shopping.service.ShopService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/v1/")
@RequiredArgsConstructor
public class ShopController {

    private final ShopService service;

    @GetMapping("getItemList")
    public List<HashMap<String, Object>> getItemList(String kind, String keyword) {
        log.info("kind={}", kind);
        log.info("keyword={}", keyword);
        return service.getItemList(kind, keyword);
    }

    @GetMapping("getItemList/{itemNo}")
    public HashMap<String, Object> getItemOne(@PathVariable int itemNo) {
        log.info("itemNo={}", itemNo);
        return service.getItemOne(itemNo);
    }
}
