package com.example.hexagonalarchiteturenetflix.transportlayers.http.adress;

import com.example.hexagonalarchiteturenetflix.entities.adress.Adress;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AdressMapperIn {

    AdressMapperIn INSTANCE = Mappers.getMapper(AdressMapperIn.class);

    Adress adressRequestToAdress(AdressRequest adressRequest);

    AdressDTO adressToAdressDTO(Adress adress);
}
