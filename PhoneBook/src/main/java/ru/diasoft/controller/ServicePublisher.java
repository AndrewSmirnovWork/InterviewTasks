package ru.diasoft.controller;


import ru.diasoft.service.PersonServiceImpl;

import javax.xml.ws.Endpoint;


public class ServicePublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/personImlp",
                new PersonServiceImpl());
    }
}
