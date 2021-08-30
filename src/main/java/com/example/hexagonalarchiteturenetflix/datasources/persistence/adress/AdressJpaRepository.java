package com.example.hexagonalarchiteturenetflix.datasources.persistence.adress;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdressJpaRepository extends JpaRepository<AdressEntity, Long> {
}
