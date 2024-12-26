package com.neoteric.creditcardwithplainjpa.controller;

import com.neoteric.creditcardwithplainjpa.dtomodel.Transaction;
import com.neoteric.creditcardwithplainjpa.entity.TransactionEntity;
import com.neoteric.creditcardwithplainjpa.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping("/transactions")
    public ResponseEntity<TransactionEntity> makeTransaction(@RequestBody Transaction transaction){
        System.out.println("controller from transaction ==== "+ transaction);
        TransactionEntity transactionEntity=transactionService.createTransaction(transaction);
     return ResponseEntity.ok(transactionEntity);
    }

    @GetMapping("/transactions/{phoneNumber}")
    public ResponseEntity<List<TransactionEntity>> getTransactionsByPhoneNumber(@PathVariable Long phoneNumber){
        List<TransactionEntity> transactionEntityList = transactionService.getTransactionsByPhoneNumber(phoneNumber);
        return ResponseEntity.ok(transactionEntityList);
    }

}
