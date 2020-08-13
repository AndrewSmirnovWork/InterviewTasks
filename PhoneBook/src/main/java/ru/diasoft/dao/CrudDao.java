package ru.diasoft.dao;

import java.util.List;

//create read update delete
public interface CrudDao<T> {
    void save(T model);

    void update(T model);

    void delete(Integer id);

    List<T> findAll();

}
