package com.example.bank.business;

import com.example.bank.model.CompanyModel;
import com.example.bank.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService{

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public List<CompanyModel> findCompanies() {
        return companyRepository.findAll();
    }

    @Override
    public CompanyModel findByRuc(String ruc) {
        return companyRepository.findByRuc(ruc);
    }
}
