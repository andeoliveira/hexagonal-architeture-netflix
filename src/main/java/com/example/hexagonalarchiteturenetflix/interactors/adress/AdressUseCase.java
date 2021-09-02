package com.example.hexagonalarchiteturenetflix.interactors.adress;

import com.example.hexagonalarchiteturenetflix.entities.adress.Adress;
import com.example.hexagonalarchiteturenetflix.interactors.exceptions.AdressNotFoundException;
import com.example.hexagonalarchiteturenetflix.repositories.adress.AdressRepository;
import org.springframework.stereotype.Service;

@Service
public class AdressUseCase {

    private final AdressRepository adressRepository;

    public AdressUseCase(AdressRepository adressRepository) {
        this.adressRepository = adressRepository;
    }

    public Adress create(Adress adress) {
        return this.adressRepository.create(adress);
    }

    public Adress getAdressByZipCodeAndStreet(String zipCode, String street) {

        return this.adressRepository.getAdressByZipCodeAndStreet(zipCode, street)
                .orElseThrow(() -> new AdressNotFoundException());

    }
}
