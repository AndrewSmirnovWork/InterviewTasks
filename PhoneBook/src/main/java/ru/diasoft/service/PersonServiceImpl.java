package ru.diasoft.service;

import org.hibernate.Transaction;
import ru.diasoft.dao.PersonDaoImpl;
import ru.diasoft.entity.Person;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;


@WebService(endpointInterface = "ru.diasoft.service.PersonService")
public class PersonServiceImpl implements PersonService {

    private static PersonDaoImpl personDao;

    private Transaction currentTransaction;

    public PersonServiceImpl() {
        personDao = new PersonDaoImpl();
    }

    @Override
    @WebMethod(exclude = true)
    public void save(Person model) {
        //открываем сессию
        personDao.openSession();
        //начинаем транкзакцию
        currentTransaction.begin();
        //save or update
        personDao.save(model);
        currentTransaction.commit();
        personDao.closeCurrentSession();
    }

    @Override
    @WebMethod(exclude = true)
    public void update(Person model) {
        personDao.openSession();
        currentTransaction.begin();
        personDao.update(model);
        currentTransaction.commit();
        personDao.closeCurrentSession();
    }

    @Override
    @WebMethod(exclude = true)
    public void delete(Integer id) {
        personDao.openSession();
        currentTransaction.begin();
        personDao.delete(id);
        currentTransaction.commit();
        personDao.closeCurrentSession();
    }

    @Override
    @WebMethod(exclude = true)
    public List<Person> findAll() {
        personDao.openSession();
        List<Person> list = personDao.findAll();
        personDao.closeCurrentSession();
        return list;

    }

}
