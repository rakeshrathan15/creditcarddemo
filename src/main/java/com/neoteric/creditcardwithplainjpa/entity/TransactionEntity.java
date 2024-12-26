package com.neoteric.creditcardwithplainjpa.entity;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "transaction", schema = "creditcarddemo")


public class TransactionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  transactionId;

    @Column(name = "amount",nullable = false)
    private Double amount;


    @Column(name = "transactiontype")
    private String transactionType;

    @Column(name = "transactionDate")
    private LocalDateTime transactionDate;


    @Column(name = "phoneNumber" ,nullable = false)
    private Long phoneNumber;


    public TransactionEntity(){

    }

    public TransactionEntity(Long transactionId, Double amount, String transactionType, LocalDateTime transactionDate, Long phoneNumber) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.transactionType = transactionType;
        this.transactionDate = transactionDate;
        this.phoneNumber = phoneNumber;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "TransactionEntity{" +
                "transactionId=" + transactionId +
                ", amount=" + amount +
                ", transactionType='" + transactionType + '\'' +
                ", transactionDate=" + transactionDate +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
