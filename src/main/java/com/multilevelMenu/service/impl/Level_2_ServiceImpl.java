package com.multilevelMenu.service.impl;

import com.multilevelMenu.dao.Level_2_Dao;
import com.multilevelMenu.entity.Level_2;
import com.multilevelMenu.service.Level_2_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class Level_2_ServiceImpl implements Level_2_Service {
    @Autowired
    Level_2_Dao level_2_dao;
    @Override
    public List<Level_2> getAll() {
        return level_2_dao.getAll();
    }
}
