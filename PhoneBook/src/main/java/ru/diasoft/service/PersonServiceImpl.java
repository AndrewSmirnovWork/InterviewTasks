package ru.diasoft.service;

import ru.diasoft.dao.PersonDaoImpl;
import ru.diasoft.entity.Person;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;


@WebService(name = "/hello", endpointInterface = "ru.diasoft.service.PersonService")
public class PersonServiceImpl implements PersonService {

    private static PersonDaoImpl personDao;

    public PersonServiceImpl() {
        personDao = new PersonDaoImpl();
    }

    @Override
    @WebMethod(exclude = true)
    public void save(Person model) {
        //save or update
        personDao.save(model);
    }

    @Override
    @WebMethod(exclude = true)
    public void update(Person model) {
        personDao.update(model);
    }

    @Override
    @WebMethod(exclude = true)
    public void delete(Integer id) {
        personDao.delete(id);
    }

    @Override
    @WebMethod(exclude = true)
    public List<Person> findAll() {
        return personDao.findAll();
    }

}
