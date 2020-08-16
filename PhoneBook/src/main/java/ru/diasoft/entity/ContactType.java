package ru.diasoft.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlType;

@Entity//Этой аннотацией мы указываем, что данный класс является сущностью.
@Table(name = "contact_type")// Этой аннотацией мы указываем, что за эту сущность в БД отвечает таблица
@XmlType
public class ContactType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "type")
    private String type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ContactType{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}



