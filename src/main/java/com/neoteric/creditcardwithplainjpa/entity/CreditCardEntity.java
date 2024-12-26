package com.neoteric.creditcardwithplainjpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.*;

import java.security.PublicKey;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "creditcard", schema = "creditcarddemo")

public class CreditCardEntity {

    @Id
    @Column(name = "cardNumber")
    private  Long cardNumber;

    @Column(name = "cvv")
    private Integer cvv;

    @Column(name = "cardExpiryDate")
    private String cardExpiryDate;


    @Column(name = "phoneNumber")
    private Long phoneNumber;

    @Column(name = "amountLimit")
    private Double amountLimit;

    @Column(name = "cardLIMIT")
    private Double cardLimit;

    public CreditCardEntity(){

    }

    public Long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Integer getCvv() {
        return cvv;
    }

    public void setCvv(Integer cvv) {
        this.cvv = cvv;
    }

    public String getCardExpiryDate() {
        return cardExpiryDate;
    }

    public void setCardExpiryDate(String cardExpiryDate) {
        this.cardExpiryDate = cardExpiryDate;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Double getAmountLimit() {
        return amountLimit;
    }

    public void setAmountLimit(Double amountLimit) {
        this.amountLimit = amountLimit;
    }

    public Double getCardLimit() {
        return cardLimit;
    }

    public void setCardLimit(Double cardLimit) {
        this.cardLimit = cardLimit;
    }

    @Override
    public String toString() {
        return "CreditCardEntity{" +
                "cardNumber=" + cardNumber +
                ", cvv=" + cvv +
                ", cardExpiryDate='" + cardExpiryDate + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", amountLimit=" + amountLimit +
                ", cardLimit=" + cardLimit +
                '}';
    }
}
