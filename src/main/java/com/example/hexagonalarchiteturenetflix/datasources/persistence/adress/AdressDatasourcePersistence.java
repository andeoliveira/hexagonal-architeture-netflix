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
        var adressCreated = adressJpaRepository.save(adressEntity);
        return AdressMapperOut.INSTANCE.adressEntityToAdress(adressCreated);
    }

    @Override
    public Optional<Adress> getAdressByZipCode(String zipCode) {

        return Optional.ofNullable(
            AdressMapperOut.INSTANCE.adressEntityToAdress(
                    adressJpaRepository.findByZipCode(zipCode).orElse(null)
            )

        );

    }
}
