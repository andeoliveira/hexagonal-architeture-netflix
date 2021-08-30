package com.example.hexagonalarchiteturenetflix.entities.customer;

import java.time.LocalDateTime;

public class Customer {

    private String firstName;

    private String lastName;

    private LocalDateTime registerDate;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDateTime getRegisterDate() {
        return registerDate;
    }
}
