package com.example.bank.business;

import com.example.bank.model.CreditModel;

import java.util.List;

public interface CreditService {

    List<CreditModel> findCredits();
    CreditModel findByNroCredito(String nrocredito);
}
