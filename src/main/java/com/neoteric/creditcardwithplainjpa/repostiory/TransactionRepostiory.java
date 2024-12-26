package com.neoteric.creditcardwithplainjpa.repostiory;

import com.neoteric.creditcardwithplainjpa.entity.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepostiory extends JpaRepository<TransactionEntity,Integer> {

  List<TransactionEntity> findByPhoneNumber(Long phoneNumber);


}
