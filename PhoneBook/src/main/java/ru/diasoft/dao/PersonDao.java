package ru.diasoft.dao;

import ru.diasoft.entity.Person;


public interface PersonDao extends CrudDao<Person> {
    void save(Person model);

    void update(Person model);

    void delete(Integer id);

    /* List<Person> findAll();*/
}
