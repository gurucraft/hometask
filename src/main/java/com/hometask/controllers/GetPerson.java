package com.hometask.controllers;

import com.hometask.entity.Person;
import com.hometask.service.PersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by guru on 21.10.14.
 * (@)Svitla Hata
 */
@Controller
public class GetPerson {
    @Autowired
    private PersonalService personalService;

    @RequestMapping(value = "/getAll",
            method = RequestMethod.GET)
    public
    @ResponseBody
    Person printHello() {
        return personalService.getAll().get(0);

    }
}
