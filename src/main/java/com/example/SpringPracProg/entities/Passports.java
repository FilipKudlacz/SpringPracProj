package com.example.SpringPracProg.entities;

import javax.persistence.*;

@Entity
@Table
public class Passports {

    @Id @Column(name = "serial_number",nullable = false, unique = true)
    private String serialNumber;

    @Column(name = "expiration_date")
    private String expirationDate;

    @Column(name = "nationality")
    private String nationality;

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}