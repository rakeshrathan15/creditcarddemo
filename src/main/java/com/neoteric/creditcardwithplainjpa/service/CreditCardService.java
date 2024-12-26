package com.neoteric.creditcardwithplainjpa.service;

import com.neoteric.creditcardwithplainjpa.entity.CreditCardEntity;
import com.neoteric.creditcardwithplainjpa.repostiory.CreditCardRepostiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreditCardService {



 //   @Autowired
    private final CreditCardRepostiory creditCardRepostiory;

    public CreditCardService(CreditCardRepostiory creditCardRepostiory) {
        this.creditCardRepostiory = creditCardRepostiory;
    }



    public CreditCardEntity getCreditCardDetails(Long phoneNumber){
        return  creditCardRepostiory.findByPhoneNumber(phoneNumber)
                .orElseThrow(() -> new RuntimeException("CreditCard not found for Phone Number : "+phoneNumber));
    }


    public CreditCardEntity saveCreditCardDetails(CreditCardEntity creditCardEntity) {
        return creditCardRepostiory.save(creditCardEntity);
    }
}
