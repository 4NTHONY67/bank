package com.example.bank.controller;

import com.example.bank.business.CompanyService;
import com.example.bank.model.CompanyModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping("/companies")
    public List<CompanyModel> findAllCompanies(){
        return companyService.findCompanies();
    }

    @GetMapping(value = "/companies/ruc", consumes = MediaType.TEXT_PLAIN_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public CompanyModel findCompanyByRuc(@RequestBody String ruc) {
        return companyService.findByRuc(ruc);
    }
}
