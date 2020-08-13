package ru.diasoft.dao;

import ru.diasoft.entity.Person;

import javax.jws.WebService;
import java.util.List;

@WebService
public interface PersonDao {
    void save(Person model);

    void update(Person model);

    void delete(Integer id);

    List<Person> findAll();
}
