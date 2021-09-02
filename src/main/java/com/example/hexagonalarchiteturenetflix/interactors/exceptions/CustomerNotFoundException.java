package com.example.hexagonalarchiteturenetflix.interactors.exceptions;

public class CustomerNotFoundException extends  RuntimeException{
    public CustomerNotFoundException(String message) {
        super(message);
    }
}
