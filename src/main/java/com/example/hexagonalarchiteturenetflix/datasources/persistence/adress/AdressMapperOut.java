package com.example.hexagonalarchiteturenetflix.datasources.persistence.adress;

import com.example.hexagonalarchiteturenetflix.entities.adress.Adress;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AdressMapperOut {

    AdressMapperOut INSTANCE = Mappers.getMapper(AdressMapperOut.class);


    Adress map(AdressEntity adressEntity);

    @Mapping(target = "street", source = "adress.street")
    @Mapping(target = "zipCode", source = "adress.zipCode")
    @Mapping(target = "id", ignore = true)
    AdressEntity adressToAdressEntity(Adress adress);

}
