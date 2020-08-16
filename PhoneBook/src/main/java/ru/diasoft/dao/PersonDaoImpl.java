package ru.diasoft.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import ru.diasoft.entity.Person;
import ru.diasoft.hibernate.HibernateSessionFactoryUtil;

import javax.jws.WebService;
import java.util.List;

@WebService
public class PersonDaoImpl implements PersonDao {

    private Session currentSession;

    private Transaction currentTransaction;

    @Override
    public void save(Person model) {
        //открываем сессию
        openSession();
        //начинаем транкзакцию
        currentTransaction.begin();
        //save or update
        currentSession.saveOrUpdate(model);
        //комит транзакции
        currentTransaction.commit();
        //закрываем текущую сессию
        closeCurrentSession();
    }

    @Override
    public void update(Person model) {
        //открываем сессию
        openSession();
        //начинаем транкзакцию
        currentTransaction.begin();
        //save or update
        currentSession.saveOrUpdate(model);
        //комит транзакции
        currentTransaction.commit();
        //закрываем текущую сессию
        closeCurrentSession();
    }

    @Override
    public void delete(Integer id) {
        //достаем нужного нам человека по id
        Person person = currentSession.get(Person.class, id);
        //открываем сессию
        openSession();
        //начинаем транкзакцию
        currentTransaction.begin();
        currentSession.delete(person);
        //комит транзакции
        currentTransaction.commit();
        //закрываем текущую сессию
        closeCurrentSession();
    }

    @Override
    public List<Person> findAll() {
        //открываем сессию
        openSession();
        //начинаем транкзакцию
        currentTransaction.begin();
        // создаем запрос, сортировака по lastName
        Query<Person> theQuery =
                currentSession.createQuery("from Person order by lastName", Person.class);

        // execute query and get result list
        return theQuery.getResultList();
    }

    public void openSession() {
        currentSession = HibernateSessionFactoryUtil.getSessionFactory().openSession();
    }

    public void closeCurrentSession() {
        currentSession.close();
    }

}
