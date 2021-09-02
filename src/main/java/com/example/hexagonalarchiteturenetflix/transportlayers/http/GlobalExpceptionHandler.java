package com.example.hexagonalarchiteturenetflix.transportlayers.http;

import com.example.hexagonalarchiteturenetflix.interactors.exceptions.AdressNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExpceptionHandler {

    @ExceptionHandler(AdressNotFoundException.class)
    public ResponseEntity<String> adressInvalid(RuntimeException e) {
        return new ResponseEntity<String>("Endereço não encontrado.", HttpStatus.BAD_REQUEST);
    }

}
