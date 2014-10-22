package com.hometask.service;

import com.hometask.entity.Person;
import com.hometask.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by guru on 21.10.14.
 * (@)Svitla Hata
 */
@Service
public class PersonalServiceImpl implements PersonalService {
    @Autowired
    PersonRepository personRepository;

    @Override
    public Person addBank(Person person) {
        return personRepository.saveAndFlush(person);
    }

    @Override
    public void delete(long id) {
        personRepository.delete(id);

    }

    @Override
    public Person getByName(String name) {
        return null;
    }

    @Override
    public Person editBank(Person person) {

        return personRepository.saveAndFlush(person);
    }

    @Override
    public List<Person> getAll() {
        return personRepository.findAll();
    }
}
