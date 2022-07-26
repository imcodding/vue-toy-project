package com.shopping.service;

import com.shopping.model.persistence.ShopMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ShopServiceImpl implements ShopService {

    private final ShopMapper mapper;

    @Override
    public List<HashMap<String, Object>> getItemList(String kind, String keyword) {
        return mapper.selectItemList(kind, keyword);
    }

    @Override
    public HashMap<String, Object> getItemOne(int itemNo) {
        return mapper.selectItemOne(itemNo);
    }
}
