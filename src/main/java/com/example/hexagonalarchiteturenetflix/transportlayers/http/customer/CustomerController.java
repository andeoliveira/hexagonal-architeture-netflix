package com.example.hexagonalarchiteturenetflix.transportlayers.http.customer;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("customer")
public class CustomerController {


    @PostMapping
    public ResponseEntity<CustomerDTO> saveCustomer(@RequestBody CustomerRequest customerRequest) {
        return  null;
    }

}
