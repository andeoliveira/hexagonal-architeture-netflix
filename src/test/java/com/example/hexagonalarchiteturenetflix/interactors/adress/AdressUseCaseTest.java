package com.example.hexagonalarchiteturenetflix.interactors.adress;

import com.example.hexagonalarchiteturenetflix.entities.adress.Adress;
import com.example.hexagonalarchiteturenetflix.repositories.adress.AdressRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class AdressUseCaseTest {

    @Mock
    AdressRepository adressRepository;

    @InjectMocks
    AdressUseCase adressUseCase;

    @Test
    @DisplayName("Deve criar um domínio de endereço (use case)")
    void deveCriarEndereco() {

        //Given
        var zipCode = "85550-000";
        var street = "Rua principal";
        var number = 39;
        var adressDomain = new Adress(zipCode, street, number);
        //When
        var adressDomainResult = adressUseCase.create(adressDomain);
        //Then
        Assertions.assertNotNull(adressDomainResult.getZipCode());
        Assertions.assertNotNull(adressDomainResult.getNumber());
        Assertions.assertNotNull(adressDomainResult.getStreet());

    }
}
