package com.example.bank.business;

import com.example.bank.model.PersonModel;

import java.util.List;

public interface PersonService {

    List<PersonModel> findPersons();
    PersonModel findByDni(String dni);
}
