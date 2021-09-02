package com.example.hexagonalarchiteturenetflix.transportlayers.http.adress;

public class AdressRequest {

    private String zipCode;

    private String street;

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
