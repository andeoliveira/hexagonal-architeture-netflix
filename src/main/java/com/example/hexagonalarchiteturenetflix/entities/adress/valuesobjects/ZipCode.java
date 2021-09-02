package com.example.hexagonalarchiteturenetflix.entities.adress.valuesobjects;

import com.example.hexagonalarchiteturenetflix.entities.exceptions.InvalidCepException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ZipCode {

    public static final Pattern VALID_CEP_REGEX = Pattern
            .compile("^\\d{5}-\\d{3}$",
            Pattern.CASE_INSENSITIVE);

    private String value;

    public ZipCode(String value) {
        this.value = value != null ? value : "";
        Matcher matcher = VALID_CEP_REGEX.matcher(value);
        if (!matcher.find()) {
            throw new InvalidCepException("CEP Inválido");
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
