package ru.diasoft.service;

import ru.diasoft.dao.PersonDaoImpl;
import ru.diasoft.entity.Person;

import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService(name = "/PersonService", endpointInterface = "ru.diasoft.service.PersonService")
public class PersonServiceImpl implements PersonService {

    private static PersonDaoImpl personDao;

    public PersonServiceImpl() {
        personDao = new PersonDaoImpl();
    }

    @Override
    @WebMethod
    public void save(Person model) {
        //save or update
        personDao.save(model);
    }

    @Override
    @WebMethod
    public void update(Person model) {
        personDao.update(model);
    }

    @Override
    @WebMethod
    public void delete(Integer id) {
        personDao.delete(id);
    }

    /*@Override
    @WebMethod
    public List<Person> findAll() {
        return personDao.findAll();
    }*/

}
