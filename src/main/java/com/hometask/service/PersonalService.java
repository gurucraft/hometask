package com.hometask.service;

import com.hometask.entity.Person;

import java.util.List;

public interface PersonalService {
    Person add(Person person);

    void delete(long id);

    Person getByName(String name);

    Person edit(Person person);

    List<Person> getAll();

    Person getById(long id);
}
