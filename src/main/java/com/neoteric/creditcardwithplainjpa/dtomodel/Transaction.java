package com.neoteric.creditcardwithplainjpa.dtomodel;


import lombok.Data;


public class Transaction {

    private double amount ;

    private String transactionType;

    private Long phoneNumber;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "amount=" + amount +
                ", transactionType='" + transactionType + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
