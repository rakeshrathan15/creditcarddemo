package com.neoteric.creditcardwithplainjpa.service;

import com.neoteric.creditcardwithplainjpa.dtomodel.Transaction;
import com.neoteric.creditcardwithplainjpa.entity.CreditCardEntity;
import com.neoteric.creditcardwithplainjpa.entity.TransactionEntity;
import com.neoteric.creditcardwithplainjpa.repostiory.CreditCardRepostiory;
import com.neoteric.creditcardwithplainjpa.repostiory.TransactionRepostiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class TransactionService {


   @Autowired
    private TransactionRepostiory transactionRepostiory;

   @Autowired
   private CreditCardRepostiory creditCardRepostiory;

   public TransactionEntity createTransaction(Transaction transaction){
       Optional<CreditCardEntity> creditCardEntityOptional=creditCardRepostiory.findByPhoneNumber(transaction.getPhoneNumber());

       if(creditCardEntityOptional.isEmpty()){
           throw new RuntimeException("Credit Card not found for the given phone number");


       }

       CreditCardEntity creditCard=creditCardEntityOptional.get();

       if(transaction.getTransactionType().equalsIgnoreCase("Debit")){

         double newAmountLimit = creditCard.getAmountLimit() - transaction.getAmount();
         if(newAmountLimit<0){
             throw new RuntimeException("Insufficient balance");
         }

         creditCard.setAmountLimit(newAmountLimit);
       } else if (transaction.getTransactionType().equalsIgnoreCase("Credit")) {
           double newAmountLimit=creditCard.getAmountLimit()+transaction.getAmount();

           if (newAmountLimit>creditCard.getCardLimit()){
               throw  new RuntimeException("Repayment amount exceeds card Limit ");


           }
           creditCard.setAmountLimit(newAmountLimit);

       } else {
           throw new RuntimeException("Invalid transaction Type ");
       }

       creditCardRepostiory.save(creditCard);

       TransactionEntity transactionEntity= new TransactionEntity();
       transactionEntity.setAmount(transaction.getAmount());
       transactionEntity.setTransactionType(transaction.getTransactionType());
       transactionEntity.setTransactionDate(LocalDateTime.now());
       System.out.println(LocalDateTime.now());
       transactionEntity.setPhoneNumber(transaction.getPhoneNumber());

       System.out.println(" Service from transaction  ===== "+transactionEntity);
       TransactionEntity savedTransaction = transactionRepostiory.save(transactionEntity);


       System.out.println("Transaction Saved: "+savedTransaction);

       return savedTransaction;
   }


   public List<TransactionEntity> getTransactionsByPhoneNumber(Long phoneNumber){

       return transactionRepostiory.findByPhoneNumber(phoneNumber);
   }

}
