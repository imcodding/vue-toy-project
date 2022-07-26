package com.shopping.model.persistence;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
@Mapper
public interface ShopMapper {

    List<HashMap<String, Object>> selectItemList(String kind, String keyword);

    HashMap<String, Object> selectItemOne(int itemNo);

}
