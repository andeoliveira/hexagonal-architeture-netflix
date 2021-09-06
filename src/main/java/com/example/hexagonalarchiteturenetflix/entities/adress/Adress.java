package com.example.hexagonalarchiteturenetflix.entities.adress;

import com.example.hexagonalarchiteturenetflix.entities.adress.valuesobjects.ZipCode;

public class Adress {

    private ZipCode zipCode;

    private String street;

    private Integer number;

    public Adress(String zipCode, String street, Integer number) {

        this.zipCode = new ZipCode(zipCode);
        this.street = street;
        this.number = number;

    }

    public String getStreet() {
        return street;
    }

    public String getZipCode() {
        return zipCode.getValue();
    }

    public Integer getNumber() {
        return number;
    }

}
