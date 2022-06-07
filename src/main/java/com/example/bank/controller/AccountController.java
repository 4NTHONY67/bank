package com.example.bank.controller;

import com.example.bank.business.AccountService;
import com.example.bank.model.AccountModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/accounts")
    public List<AccountModel> findAllAccounts(){
        return accountService.findAccounts();
    }

    @GetMapping(value = "/accounts/nrocuenta", consumes = MediaType.TEXT_PLAIN_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public AccountModel findAccountByNro(@RequestBody String nrocuenta) {
        return accountService.findByAccount(nrocuenta);
    }
}
