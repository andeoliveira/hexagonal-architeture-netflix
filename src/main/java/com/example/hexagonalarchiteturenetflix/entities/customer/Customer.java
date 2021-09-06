package com.example.hexagonalarchiteturenetflix.entities.customer;

import com.example.hexagonalarchiteturenetflix.entities.adress.Adress;
import com.example.hexagonalarchiteturenetflix.entities.customer.valuesobjects.Cpf;
import com.example.hexagonalarchiteturenetflix.entities.customer.valuesobjects.Name;
import com.example.hexagonalarchiteturenetflix.entities.exceptions.InvalidBirthDateException;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Customer {

    private Long id;

    private Name firstName;

    private Name lastName;

    private Cpf cpf;

    private LocalDate birthDate;

    private LocalDateTime registerDate;

    private Adress adress;

    public Customer(String firstName, String lastName, String cpf, String birthDate, String zipCode, String street, Integer number) {

        this.firstName = new Name(firstName);
        this.lastName = new Name(lastName);
        this.cpf = new Cpf(cpf);
        this.birthDate = this.verifyBirthDate(birthDate);
        this.registerDate = LocalDateTime.now();
        this.adress = new Adress(zipCode, street, number);

    }

    private LocalDate verifyBirthDate(String birthDate) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try {
            return LocalDate.parse(birthDate, formatter);
        } catch (RuntimeException e) {
            throw new InvalidBirthDateException();
        }

    }

    public Name getFirstName() {
        return firstName;
    }

    public Name getLastName() {
        return lastName;
    }

    public Cpf getCpf() {
        return cpf;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public LocalDateTime getRegisterDate() {
        return registerDate;
    }

    public Adress getAdress() {
        return adress;
    }

    public Long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return firstName.equals(customer.firstName) && lastName.equals(customer.lastName) && cpf.equals(customer.cpf) && birthDate.equals(customer.birthDate) && registerDate.equals(customer.registerDate) && adress.equals(customer.adress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, cpf, birthDate, registerDate, adress);
    }
}
