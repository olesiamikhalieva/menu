package com.multilevelMenu.dao.impl;

import com.multilevelMenu.dao.Level_3_Dao;
import com.multilevelMenu.entity.Level_3;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class Level_3_DaoImpl implements Level_3_Dao {
@Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<Level_3> getAll() {
            Session currentSession = sessionFactory.getCurrentSession();
            Query<Level_3> theQuery = currentSession.createQuery("from Level_3", Level_3.class);
            return theQuery.getResultList();
    }
}
