package com.example.hexagonalarchiteturenetflix.entities.customer.valuesobjects;

import java.util.regex.Pattern;

public class Cpf {

    private static final int[] lengthCpf = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};

    private final String pattern = "\\d{11}|\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}";
    private final String repeated = "(\\d)\\1{10}";

    private final String value;

    public Cpf(String cpf) {

        if (!valid(cpf)) {
            throw new IllegalArgumentException();
        }
        this.value = cpf;

    }

    private boolean valid(String cpf) {

        if (!Pattern.compile(pattern).matcher(cpf).matches()) {
            return false;
        }
        if (cpf.length() == 14) {
            cpf = cpf.trim().replaceAll("\\D", "");
        }
        if (Pattern.compile(repeated).matcher(cpf).matches()) {
            return false;
        }

        Integer digit1 = calcDigit(cpf.substring(0, 9));
        Integer digit2 = calcDigit(cpf.substring(0, 9) + digit1);

        return cpf.equals(cpf.substring(0, 9) + digit1.toString() + digit2.toString());

    }

    private int calcDigit(String str) {

        int total = 0;

        for (int i = str.length() - 1, digit; i >= 0; i--) {
            digit = Integer.parseInt(str.substring(i, i + 1));
            total += digit * lengthCpf[lengthCpf.length - str.length() + i];
        }

        total = 11 - total % 11;

        return total > 9 ? 0 : total;

    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
