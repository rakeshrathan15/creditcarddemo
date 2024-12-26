package com.neoteric.creditcardwithplainjpa.service;

import com.neoteric.creditcardwithplainjpa.entity.CardHolderEntity;
import com.neoteric.creditcardwithplainjpa.repostiory.CardHolderJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CardHolderService {

    @Autowired
    private CardHolderJpaRepository cardHolderJpaRepository;

    public boolean validateCardHolder(CardHolderEntity cardHolder){

        Optional<CardHolderEntity> existingCardHolder= cardHolderJpaRepository.findByPhoneNumber(cardHolder.getPhoneNumber());
        System.out.println("from cardHolder Service = "+existingCardHolder);

        return existingCardHolder.isPresent() && existingCardHolder.get().getPassword().equals(cardHolder.getPassword());
    }

}
