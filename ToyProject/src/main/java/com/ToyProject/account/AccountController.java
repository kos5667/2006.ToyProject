package com.ToyProject.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

  
    @Autowired
    AccountService accountService;


    @GetMapping("/create")
    public Account create() {
        
        Account acc= new Account();
        acc.setUsername("kpkim");
        acc.setPassword("password");
        return accountService.save(acc);
         

    @GetMapping("/select")
    public Account selectAuthUser(Account acc){
        acc.setUsername("kpkim");
        acc.setPassword("password");
        
        
        return accountService.selectAuthUser(acc);
    }

}