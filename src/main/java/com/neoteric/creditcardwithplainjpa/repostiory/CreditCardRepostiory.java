package com.neoteric.creditcardwithplainjpa.repostiory;

import com.neoteric.creditcardwithplainjpa.entity.CreditCardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CreditCardRepostiory extends JpaRepository<CreditCardEntity,Integer> {

    Optional<CreditCardEntity> findByCardNumber(Long cardNumber);

    Optional<CreditCardEntity> findByPhoneNumber(Long PhoneNumber);

}
