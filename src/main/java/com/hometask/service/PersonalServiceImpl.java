package com.hometask.service;

import com.hometask.entity.Person;
import com.hometask.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PersonalServiceImpl implements PersonalService {
    @Autowired
    PersonRepository personRepository;

    @Override
    public Person add(Person person) {
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
    public Person edit(Person person) {

        return personRepository.saveAndFlush(person);
    }

    @Override
    public List<Person> getAll() {
        return personRepository.findAll();
    }

    @Override
    public Person getById(long id) {
        return personRepository.findOne(id);
    }
}
