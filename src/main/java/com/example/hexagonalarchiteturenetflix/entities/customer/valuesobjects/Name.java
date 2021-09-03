package com.example.hexagonalarchiteturenetflix.entities.customer.valuesobjects;

import com.example.hexagonalarchiteturenetflix.entities.exceptions.InvalidNameException;

public class Name implements Comparable<Name> {

    private String value;

    private int minSize;

    private int maxSize;

    public Name(String value) {
        this(value, 4, 2);
    }

    public Name(String value, int minSize, int maxSize) {

        this.minSize = minSize;
        this.maxSize = maxSize;

        if (value != null) {
            this.value = value.trim();
        }

        if (isInvalid()) {
            throw new InvalidNameException();
        }
    }


    public boolean isInvalid() {
        if (value == null) {
            return true;
        }

        boolean hasMinSize = value.length() >= minSize;
        boolean hasMaxSize = value.length() <= maxSize;
        return !hasMinSize || !hasMaxSize;
    }

    public String getValue() {
        return value;
    }

    @Override
    public int compareTo(Name o) {
        return value.compareTo(o.value);
    }

    @Override
    public String toString() {
        return value;
    }
}
