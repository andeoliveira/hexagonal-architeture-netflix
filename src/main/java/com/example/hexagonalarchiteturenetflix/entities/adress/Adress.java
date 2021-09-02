package com.example.hexagonalarchiteturenetflix.entities.adress;

import com.example.hexagonalarchiteturenetflix.entities.adress.valuesobjects.ZipCode;

public class Adress {

    private ZipCode zipCode;

    private String street;

    public Adress(String zipCode, String street) {

        this.zipCode = new ZipCode(zipCode);
        this.street = street;

    }

    public String getStreet() {
        return street;
    }

    public String getZipCode() {
        return zipCode.getValue();
    }
}
