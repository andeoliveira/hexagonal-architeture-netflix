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

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<AdressDTO> getAdressByZipCodeAndStreet(
            @RequestParam String zipCode, @RequestParam String street) {

        return ResponseEntity.ok(
                AdressMapperIn.INSTANCE.adressToAdressDTO(
                        adressUseCase.getAdressByZipCodeAndStreet(zipCode, street)
                )
        );

    }

    @PostMapping
    public ResponseEntity<AdressDTO> create(@RequestBody AdressDTO adressDTO) {

        var adressCreated = adressUseCase.create(
                AdressMapperIn.INSTANCE.adressDTOToAdress(adressDTO)
        );
        var uri = getLocation(adressCreated.getZipCode(), adressCreated.getStreet());
        return ResponseEntity.created(uri)
                .body(AdressMapperIn.INSTANCE.adressToAdressDTO(adressCreated));

    }

    private URI getLocation(String zipCode, String street) {
        return ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{zipcode}/{street}").buildAndExpand(zipCode, street).toUri();
    }

}
