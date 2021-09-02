package com.example.hexagonalarchiteturenetflix.entities.adress.valuesobjects;

import com.example.hexagonalarchiteturenetflix.entities.exceptions.InvalidZipCodeException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ZipCode {

    public static final Pattern VALID_ZIPCODE_REGEX = Pattern
            .compile("^\\d{5}-\\d{3}$",
            Pattern.CASE_INSENSITIVE);

    private String value;

    public ZipCode(String value) {

        this.value = value != null ? value : "";
        this.validRegexZipCode();
        this.isValid();

    }

    private void isValid(){

    }

    private void validRegexZipCode() {
        Matcher matcher = VALID_ZIPCODE_REGEX.matcher(value);
        if (!matcher.find()) {
            throw new InvalidZipCodeException("CEP Inválido");
        }
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
