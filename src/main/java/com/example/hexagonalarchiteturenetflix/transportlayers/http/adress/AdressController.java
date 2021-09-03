package com.example.hexagonalarchiteturenetflix.transportlayers.http.adress;

import com.example.hexagonalarchiteturenetflix.interactors.adress.AdressUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController()
@RequestMapping("/adress")
public class AdressController {

    @Autowired
    AdressUseCase adressUseCase;

    @GetMapping("/{zipcode}/{street}")
    public ResponseEntity<AdressDTO> getAdressByZipCodeAndStreet(
            @PathVariable String zipcode, @PathVariable String street) {
        return ResponseEntity.ok(
                AdressMapperIn.INSTANCE.adressToAdressDTO(
                        adressUseCase.getAdressByZipCodeAndStreet(zipcode, street)
                )
        );
    }

    @PostMapping
    public ResponseEntity<AdressDTO> create(@RequestBody AdressRequest adressRequest) {
        var adressCreated = adressUseCase.create(
                AdressMapperIn.INSTANCE.adressRequestToAdress(adressRequest)
        );
        return ResponseEntity.created(getLocation(adressCreated.getZipCode())).build();
    }

    private URI getLocation(String zipCode) {
        return ServletUriComponentsBuilder.fromCurrentRequest().path("/{zipcode}").buildAndExpand(zipCode).toUri();
    }

}
