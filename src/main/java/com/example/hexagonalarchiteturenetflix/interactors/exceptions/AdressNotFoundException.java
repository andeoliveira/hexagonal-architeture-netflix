package com.example.hexagonalarchiteturenetflix.interactors.exceptions;

public class AdressNotFoundException extends  RuntimeException{
    public AdressNotFoundException(String message) {
        super(message);
    }
}
