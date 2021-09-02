package com.example.hexagonalarchiteturenetflix.entities.exceptions;

public class InvalidZipCodeException extends RuntimeException{

    public InvalidZipCodeException(String message) {
        super(message);
    }
}
