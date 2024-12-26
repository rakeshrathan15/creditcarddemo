package com.neoteric.creditcardwithplainjpa.controller;

import com.neoteric.creditcardwithplainjpa.entity.CreditCardEntity;
import com.neoteric.creditcardwithplainjpa.service.CreditCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class CreditCardController {

  //  @Autowired
    private final CreditCardService creditCardService;

    public CreditCardController(CreditCardService creditCardService) {
        this.creditCardService = creditCardService;
    }



    @GetMapping("/getCreditCardDetails")
    public ResponseEntity<CreditCardEntity> getCreditCardDetails(@RequestParam Long phoneNumber){

        System.out.println("Fetching creditCarddetails for phone Number " + phoneNumber);

        CreditCardEntity creditCard= creditCardService.getCreditCardDetails(phoneNumber);

        System.out.println(creditCard);

        return ResponseEntity.ok(creditCard);
    }

    @PostMapping("/addCreditCardDetails")
    public ResponseEntity<CreditCardEntity> addCreditCardDetails(@RequestBody CreditCardEntity creditCardEntity) {
        CreditCardEntity savedEntity = creditCardService.saveCreditCardDetails(creditCardEntity);
        return ResponseEntity.ok(savedEntity);
    }


}
