package ru.diasoft.service;

import ru.diasoft.entity.Person;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.List;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface PersonService {

    void save(Person model);

    void update(Person model);

    void delete(Integer id);

    List<Person> findAll();
}
