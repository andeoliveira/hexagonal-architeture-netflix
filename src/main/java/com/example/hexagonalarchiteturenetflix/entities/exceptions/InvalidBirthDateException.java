package com.example.hexagonalarchiteturenetflix.entities.exceptions;

public class InvalidBirthDateException extends RuntimeException{

    public InvalidBirthDateException(String message) {
        super(message);
    }
}
