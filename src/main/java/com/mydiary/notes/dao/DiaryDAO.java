package com.mydiary.notes.dao;

import com.mydiary.notes.entity.Shop;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DiaryDAO extends BaseDAO<Shop> {
    public DiaryDAO() {
        super(Shop.class);
    }



}
