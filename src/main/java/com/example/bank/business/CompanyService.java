package com.example.bank.business;

import com.example.bank.model.CompanyModel;

import java.util.List;

public interface CompanyService {

    List<CompanyModel> findCompanies();
    CompanyModel findByRuc(String ruc);
}
