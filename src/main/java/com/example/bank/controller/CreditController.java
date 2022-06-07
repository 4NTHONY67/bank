package com.example.bank.controller;

import com.example.bank.business.CreditService;
import com.example.bank.model.CreditModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
public class CreditController {

    @Autowired
    private CreditService creditService;

    @GetMapping("/credits")
    public List<CreditModel> findAllCredits(){
        return creditService.findCredits();
    }

    @GetMapping(value = "/credits/nrocredito", consumes = MediaType.TEXT_PLAIN_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public CreditModel findCreditByNro(@RequestBody String nrocredito) {
        return creditService.findByNroCredito(nrocredito);
    }
}
