package com.neoteric.creditcardwithplainjpa.repostiory;

import com.neoteric.creditcardwithplainjpa.entity.CardHolderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CardHolderJpaRepository extends JpaRepository<CardHolderEntity,Long> {

   Optional<CardHolderEntity> findByPhoneNumber(Long phoneNumber);

}
