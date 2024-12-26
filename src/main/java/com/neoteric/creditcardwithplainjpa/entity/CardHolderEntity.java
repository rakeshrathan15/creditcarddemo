package com.neoteric.creditcardwithplainjpa.entity;


import jakarta.persistence.*;
import lombok.Data;

import javax.print.attribute.standard.MediaSize;

@Entity
@Table(name = "cardholder",schema = "creditcarddemo")

public class CardHolderEntity {

    @Id
    @Column(name = "phoneNumber")
    private Long phoneNumber;

    @Column(name = "name")
    private String name;


    @Column(name = "password")
    private String password;



    public CardHolderEntity(){

    }


    public CardHolderEntity(Long phoneNumber, String name, String password) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.password = password;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "CardHolderEntity{" +
                "phoneNumber=" + phoneNumber +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
