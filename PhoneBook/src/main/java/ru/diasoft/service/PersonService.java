package ru.diasoft.service;

import ru.diasoft.dao.CrudDao;
import ru.diasoft.entity.Person;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface PersonService extends CrudDao<Person> {

    void save(Person model);

    void update(Person model);

    void delete(Integer id);

    /*List<Person> findAll();*/
}
