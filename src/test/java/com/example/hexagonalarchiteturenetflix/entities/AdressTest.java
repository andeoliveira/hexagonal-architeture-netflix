package com.example.hexagonalarchiteturenetflix.entities;

import com.example.hexagonalarchiteturenetflix.entities.adress.Adress;
import com.example.hexagonalarchiteturenetflix.entities.adress.valuesobjects.ZipCode;
import com.example.hexagonalarchiteturenetflix.entities.exceptions.InvalidZipCodeException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class AdressTest {

    @Test
    @DisplayName("Deve retornar um dominio endereço")
    void deveRetornarDominioEndereco() {

        //Given
        var zipCode = "85550-000";
        var street = "Rua principal";
        var number = 39;

        //When
        var adressDomain = new Adress(zipCode, street, number);

        //Then
        Assertions.assertNotNull(adressDomain.getZipCode());
        Assertions.assertNotNull(adressDomain.getNumber());
        Assertions.assertNotNull(adressDomain.getStreet());
        Assertions.assertEquals(zipCode, adressDomain.getZipCode());
        Assertions.assertEquals(street, adressDomain.getStreet());
        Assertions.assertEquals(number, adressDomain.getNumber());

    }

    @Test
    @DisplayName("deve retornar CEP Inválido.")
    void deveValidarCEPInvalido() {

        //Given
        var zipCode = "85X5000";
        var street = "Rua principal";
        var number = 39;

        //When
        Exception exception = Assertions.assertThrows(InvalidZipCodeException.class, () -> {
            new Adress(zipCode, street, number);
        });

        //then
        Assertions.assertTrue(exception.getMessage().equals("CEP Inválido."));

    }

    @Test
    @DisplayName("Deve retornar objeto CEP válido")
    void deveRetornarCEP() {

        //Given
        var zipCode = "85550-000";
        //When
        var zipCodeDomain = new ZipCode(zipCode);
        //Then
        Assertions.assertNotNull(zipCodeDomain);
        Assertions.assertEquals(zipCode, zipCodeDomain.getValue());

    }
}
