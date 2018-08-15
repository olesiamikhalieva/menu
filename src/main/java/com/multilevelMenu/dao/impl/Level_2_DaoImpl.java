package com.multilevelMenu.dao.impl;

import com.multilevelMenu.dao.Level_1_Dao;
import com.multilevelMenu.dao.Level_2_Dao;
import com.multilevelMenu.entity.Level_1;
import com.multilevelMenu.entity.Level_2;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class Level_2_DaoImpl implements Level_2_Dao {
@Autowired
    SessionFactory sessionFactory;
    @Override
    public List<Level_2> getAll() {
            Session currentSession = sessionFactory.getCurrentSession();
            Query<Level_2> theQuery = currentSession.createQuery("from Level_2", Level_2.class);
            return theQuery.getResultList();
    }
}
