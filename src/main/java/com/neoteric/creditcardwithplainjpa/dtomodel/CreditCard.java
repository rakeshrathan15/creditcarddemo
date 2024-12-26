package com.neoteric.creditcardwithplainjpa.dtomodel;



public class CreditCard {

    private  Long cardNumber;


    private Integer cvv;


    private String cardExpiryDate;



    private Long phoneNumber;


    private Double amountLimit;


    private Double cardLimit;

    public CreditCard(){


    }


    public CreditCard(Long cardNumber, Integer cvv, String cardExpiryDate, Long phoneNumber, Double amountLimit, Double cardLimit) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.cardExpiryDate = cardExpiryDate;
        this.phoneNumber = phoneNumber;
        this.amountLimit = amountLimit;
        this.cardLimit = cardLimit;
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
        return "CreditCard{" +
                "cardNumber=" + cardNumber +
                ", cvv=" + cvv +
                ", cardExpiryDate='" + cardExpiryDate + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", amountLimit=" + amountLimit +
                ", cardLimit=" + cardLimit +
                '}';
    }
}
