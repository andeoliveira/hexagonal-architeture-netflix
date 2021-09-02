package com.example.hexagonalarchiteturenetflix.datasources.persistence.adress;

import com.example.hexagonalarchiteturenetflix.entities.adress.Adress;
import com.example.hexagonalarchiteturenetflix.repositories.adress.AdressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdressDatasourcePersistence implements AdressRepository {

    @Autowired
    AdressJpaRepository adressJpaRepository;

    @Override
    public Adress create(Adress adress) {

        var adressEntity = AdressMapperOut.INSTANCE.adressToAdressEntity(adress);

        var adressBD = adressJpaRepository.findByZipCodeAndStreet(adress.getZipCode(), adress.getStreet());
        if (adressBD.isPresent()) {
            adressEntity.setId(adressBD.get().getId());
            adressEntity.setStreet(adress.getStreet());
        }

        return AdressMapperOut.INSTANCE.map(
                adressJpaRepository.save(adressEntity)
        );

    }

    @Override
    public Optional<Adress> getAdressByZipCodeAndStreet(String zipCode, String street) {

        return Optional.ofNullable(
            AdressMapperOut.INSTANCE.map(
                    adressJpaRepository.findByZipCodeAndStreet(zipCode, street).orElse(null)
            )

        );

    }
}
