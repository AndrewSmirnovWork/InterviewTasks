package ru.diasoft.dao;

public interface CrudDao<T> {

    /* List<T> findAll();*/

    void save(T t);

    void update(T t);

    void delete(Integer i);
}

