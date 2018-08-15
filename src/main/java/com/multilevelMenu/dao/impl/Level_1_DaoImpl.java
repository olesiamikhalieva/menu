package com.multilevelMenu.dao.impl;

import com.multilevelMenu.dao.Level_1_Dao;
import com.multilevelMenu.entity.Level_1;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class Level_1_DaoImpl implements Level_1_Dao {
@Autowired
    SessionFactory sessionFactory;
    @Override
    public List<Level_1> getAll() {
            Session currentSession = sessionFactory.getCurrentSession();
            Query<Level_1> theQuery = currentSession.createQuery("from Level_1", Level_1.class);
            return theQuery.getResultList();
    }
}
