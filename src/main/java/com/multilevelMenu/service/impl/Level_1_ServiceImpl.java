package com.multilevelMenu.service.impl;

import com.multilevelMenu.dao.Level_1_Dao;
import com.multilevelMenu.dao.impl.MenuDaoImpl;
import com.multilevelMenu.entity.Level_1;
import com.multilevelMenu.service.Level_1_Service;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class Level_1_ServiceImpl  implements Level_1_Service {
@Autowired
Level_1_Dao level_1_dao;
    @Override
    public List<Level_1> getAll() {
        return level_1_dao.getAll();
    }
}
