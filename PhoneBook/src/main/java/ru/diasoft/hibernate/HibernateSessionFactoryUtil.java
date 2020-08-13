package ru.diasoft.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.diasoft.entity.ContactType;
import ru.diasoft.entity.Contacts;
import ru.diasoft.entity.Person;

public class HibernateSessionFactoryUtil {

    private static final SessionFactory sessionFactory;

    static {
        try {
            //Создаем нашу Фабрику сессий.
            //Она нужна т.к с БД мы работаем через сессии
            //добавляем все наши классы сущности
            sessionFactory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(Person.class)
                    .addAnnotatedClass(Contacts.class)
                    .addAnnotatedClass(ContactType.class)
                    .buildSessionFactory();

        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
