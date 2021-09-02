package com.example.hexagonalarchiteturenetflix.transportlayers.http.adress;

import com.example.hexagonalarchiteturenetflix.entities.adress.Adress;
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

    @GetMapping("/{zipcode}")
    public ResponseEntity<AdressDTO> getAdressByZipCode(@PathVariable String zipcode) {
        return ResponseEntity.ok(
                AdressMapperIn.INSTANCE.adressToAdressDTO(
                        adressUseCase.getAdressByZipCode(zipcode)
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
        return ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{zipcode}")
                .buildAndExpand(zipCode).toUri();
    }

}
