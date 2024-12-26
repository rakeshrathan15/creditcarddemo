package com.neoteric.creditcardwithplainjpa.controller;

import com.neoteric.creditcardwithplainjpa.entity.CardHolderEntity;
import com.neoteric.creditcardwithplainjpa.service.CardHolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class CardHolderController {


    @Autowired
    private CardHolderService cardHolderService;

    @PostMapping("/validate")
    public boolean validate(@RequestBody CardHolderEntity cardHolder){
        System.out.println("Validating user with phone number "+ cardHolder);
        return cardHolderService.validateCardHolder(cardHolder);
    }
}
