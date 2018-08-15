package com.multilevelMenu.service.impl;

import com.multilevelMenu.dao.MenuDao;
import com.multilevelMenu.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuDao menuDao;

    @Override
    public void remove(Object o) {
    menuDao.remove(o);
    }

    @Override
    public void saveOrUpdate(Object o) {
    menuDao.saveOrUpdate(o);
    }
}
