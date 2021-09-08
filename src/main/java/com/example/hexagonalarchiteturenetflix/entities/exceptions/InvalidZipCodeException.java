package com.example.hexagonalarchiteturenetflix.entities.exceptions;

public class InvalidZipCodeException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public InvalidZipCodeException(String message) {
        super(message);
    }

}
