package com.example.hexagonalarchiteturenetflix.transportlayers.http;

import com.example.hexagonalarchiteturenetflix.entities.exceptions.InvalidBirthDateException;
import com.example.hexagonalarchiteturenetflix.entities.exceptions.InvalidCpfException;
import com.example.hexagonalarchiteturenetflix.entities.exceptions.InvalidNameException;
import com.example.hexagonalarchiteturenetflix.entities.exceptions.InvalidZipCodeException;
import com.example.hexagonalarchiteturenetflix.interactors.exceptions.AdressNotFoundException;
import com.example.hexagonalarchiteturenetflix.interactors.exceptions.CustomerNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExpceptionHandler {

    @ExceptionHandler(AdressNotFoundException.class)
    public ResponseEntity<String> adressNotFoud(RuntimeException e) {
        return new ResponseEntity<String>("Endereço não encontrado.", HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(CustomerNotFoundException.class)
    public ResponseEntity<String> customerNotFound(RuntimeException e) {
        return new ResponseEntity<String>("Cliente não encontrado.", HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(InvalidZipCodeException.class)
    public ResponseEntity<String> zipCodeInvalid(RuntimeException e) {
        return new ResponseEntity<String>("CEP Inválido.", HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(InvalidNameException.class)
    public ResponseEntity<String> nameInvalid(RuntimeException e) {
        return new ResponseEntity<String>("Primeiro nome ou segundo nome inválido.", HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(InvalidBirthDateException.class)
    public ResponseEntity<String> birthDateInvalid(RuntimeException e) {
        return new ResponseEntity<String>("Data de nascimento inválida.", HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(InvalidCpfException.class)
    public ResponseEntity<String> cpfInvalid(RuntimeException e) {
        return new ResponseEntity<String>("CPF Inválido.", HttpStatus.BAD_REQUEST);
    }

}
