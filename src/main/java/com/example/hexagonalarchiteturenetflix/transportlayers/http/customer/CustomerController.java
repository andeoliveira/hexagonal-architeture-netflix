package com.example.hexagonalarchiteturenetflix.transportlayers.http.customer;

import com.example.hexagonalarchiteturenetflix.entities.customer.Customer;
import com.example.hexagonalarchiteturenetflix.interactors.customer.CustomerUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController()
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    private CustomerUseCase customerUseCase;

    @GetMapping("/{id}")
    public ResponseEntity<CustomerDTO> getCustomerById(@RequestParam Long id) {
        Customer customerDomain = customerUseCase.getCustomer(id);
        return ResponseEntity.ok(CustomerMapperIn.INSTANCE.customerToCustomerDTO(customerDomain));
    }

    @PostMapping
    public ResponseEntity<CustomerDTO> create(@RequestBody CustomerRequest customerRequest) {

        var customerDomain = CustomerMapperIn.INSTANCE.customerRequestToCustomer(customerRequest);
        var customerCreated = customerUseCase.create(customerDomain);
        return ResponseEntity.created(getLocationCustomer(customerCreated.getId())).build();

    }

    private URI getLocationCustomer(Long id) {
        return ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(id).toUri();
    }

}
