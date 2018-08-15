package com.multilevelMenu.dao;

public interface MenuDao<T> {

    void remove(T o);

    void saveOrUpdate(T o);
}
