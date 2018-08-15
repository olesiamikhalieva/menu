package com.multilevelMenu.service.impl;

import com.multilevelMenu.dao.Level_3_Dao;
import com.multilevelMenu.entity.Level_3;
import com.multilevelMenu.service.Level_3_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class Level_3_ServiceImpl implements Level_3_Service {
    @Autowired
    private Level_3_Dao level_3_dao;

    @Override
    public List<Level_3> getAll() {
        return level_3_dao.getAll();
    }
}
