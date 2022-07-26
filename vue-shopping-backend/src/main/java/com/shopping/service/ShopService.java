package com.shopping.service;

import java.util.HashMap;
import java.util.List;

public interface ShopService {

    List<HashMap<String, Object>> getItemList(String kind, String keyword);

    HashMap<String, Object> getItemOne(int itemNo);
}
