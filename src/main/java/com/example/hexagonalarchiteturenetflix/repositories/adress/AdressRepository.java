package com.example.hexagonalarchiteturenetflix.repositories.adress;

import com.example.hexagonalarchiteturenetflix.entities.adress.Adress;

import java.util.Optional;

public interface AdressRepository {

    Adress create(Adress adress);

    Optional<Adress> getAdressByZipCodeAndStreet(String zipCode, String street);
}
