package com.mydiary.notes.service;

import com.mydiary.notes.dao.DiaryDAO;
import com.mydiary.notes.entity.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Component
public class DiaryService {

    @Autowired
    DiaryDAO diaryDAO;

    public void setDiaryDAO(DiaryDAO diaryDAO) {
        this.diaryDAO = diaryDAO;
    }

    @Transactional
    public void persistShop(Shop cse){
        diaryDAO.save(cse);
    }

    @Transactional
    public void deleteShop(int id){
        diaryDAO.delete(diaryDAO.findByID(id));
    }

    @Transactional
    public Shop updateShop(Shop c){
        
        Shop temp = diaryDAO.findByID(c.getId());
        temp.setNoteHeader(c.getNoteHeader());
        temp.setNoteDescription(c.getNoteDescription());
        temp.setUpdatedBy("volkan");
        temp.setUpdatedDate(new Date());
        diaryDAO.save(temp);
        return temp;
    }

    @Transactional
    public void mergeShop(Shop cse){
        diaryDAO.merge(cse);
    }

    @Transactional
    public Shop getByID(int id){
        return diaryDAO.findByID(id);
    }

    @Transactional
    public List<Shop> getAll(){
        return diaryDAO.findAll();
    }


}
