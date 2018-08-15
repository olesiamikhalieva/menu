package com.multilevelMenu.dao.impl;

import com.multilevelMenu.dao.MenuDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class MenuDaoImpl<T> implements MenuDao {


    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void remove(Object o) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.remove(o);
    }

    @Override
    public void saveOrUpdate(Object o) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(o);
    }

}
