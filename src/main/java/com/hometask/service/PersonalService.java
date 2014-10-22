package com.hometask.service;

import com.hometask.entity.Person;

import java.util.List;

/**
 * Created by guru on 21.10.14.
 * (@)Svitla Hata
 */
public interface PersonalService {
    Person addBank(Person person);

    void delete(long id);

    Person getByName(String name);

    Person editBank(Person person);

    List<Person> getAll();
}
