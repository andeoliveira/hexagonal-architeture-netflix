package com.example.hexagonalarchiteturenetflix.datasources.persistence.adress;

import com.example.hexagonalarchiteturenetflix.entities.adress.Adress;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AdressMapper {

    AdressMapper INSTANCE = Mappers.getMapper(AdressMapper.class);

    Adress adressEntityToAdress(AdressEntity adressEntity);

    AdressEntity adressToAdressEntity(Adress adress);
}
