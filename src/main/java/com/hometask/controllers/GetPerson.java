package com.hometask.controllers;

import com.hometask.entity.Person;
import com.hometask.service.PersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/getPerson")
public class GetPerson {
    @Autowired
    private PersonalService personalService;

    @RequestMapping(method = RequestMethod.GET)
    public
    @ResponseBody
    List<Person> printHello() {
        return personalService.getAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public
    @ResponseBody
    Person getPersonById(@PathVariable("id") long id) {
        return personalService.getById(id);
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST, consumes = "application/json")
    public Person addPerson(@RequestBody Person person, Model model) {
        personalService.add(person);
        return person;
    }

}
