package ru.diasoft.dao;

import org.hibernate.Session;
import org.hibernate.query.Query;
import ru.diasoft.entity.Person;
import ru.diasoft.hibernate.HibernateSessionFactoryUtil;

import javax.jws.WebService;
import java.util.List;

@WebService
public class PersonDaoImpl implements PersonDao {

    private Session currentSession;

    @Override
    public void save(Person model) {
        //save or update
        currentSession.saveOrUpdate(model);
    }

    @Override
    public void update(Person model) {
        //save or update
        currentSession.saveOrUpdate(model);
    }

    @Override
    public void delete(Integer id) {
        //достаем нужного нам человека по id
        Person person = currentSession.get(Person.class, id);
        currentSession.delete(person);
    }

    @Override
    public List<Person> findAll() {

        // create a query..sort by last name
        Session currentSession = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Query<Person> theQuery =
                currentSession.createQuery("from Customer order by lastName", Person.class);

        // execute query and get result list
        return theQuery.getResultList();
    }

    public Session openSession() {
        currentSession = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        return currentSession;
    }

    public void closeCurrentSession() {
        currentSession.close();
    }

}
