package com.example.bank.controller;

import com.example.bank.business.PersonService;
import com.example.bank.model.PersonModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/persons")
    public List<PersonModel> findAllPersons(){
        return personService.findPersons();
    }

    @GetMapping(value = "/persons/dni", consumes = MediaType.TEXT_PLAIN_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public PersonModel findPersonByDni(@RequestBody String dni) {
        //return carService.findCarByModel(model);
        return personService.findByDni(dni);
    }
}
