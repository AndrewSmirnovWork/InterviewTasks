package ru.diasoft.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity//Этой аннотацией мы указываем, что данный класс является сущностью.
@Table(name = "contacts")// Этой аннотацией мы указываем, что за эту сущность в БД отвечает таблица
@XmlRootElement
public class Contacts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "number")
    private int number;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.DETACH,
            CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "person_id")
    private Person person;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "contact_type_id")
    private ContactType contactType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public ContactType getContactType() {
        return contactType;
    }

    public void setContactType(ContactType contactType) {
        this.contactType = contactType;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "id=" + id +
                ", number=" + number +
                ", person=" + person +
                ", contactType=" + contactType +
                '}';
    }
}
