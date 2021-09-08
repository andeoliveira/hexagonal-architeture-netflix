package com.example.hexagonalarchiteturenetflix.datasources.db.adress;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdressJpaRepository extends JpaRepository<AdressEntity, Long> {
    Optional<AdressEntity> findByZipCodeAndStreet(String zipCode, String street);
}
