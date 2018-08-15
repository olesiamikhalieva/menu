package com.multilevelMenu.service;

public interface MenuService<T> {

    void remove(T o);

    void saveOrUpdate(T o);
}
