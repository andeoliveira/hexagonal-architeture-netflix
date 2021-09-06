package com.example.hexagonalarchiteturenetflix.interactors.customer;

import com.example.hexagonalarchiteturenetflix.entities.customer.Customer;
import com.example.hexagonalarchiteturenetflix.interactors.exceptions.CustomerNotFoundException;
import com.example.hexagonalarchiteturenetflix.repositories.customer.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerUseCase {

    private final CustomerRepository customerRepository;

    public CustomerUseCase(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer create(Customer customer) {
        return customerRepository.create(customer);
    }

    public Customer getCustomer(Long id) {
        return customerRepository.getCustomer(id).orElseThrow(() -> new CustomerNotFoundException());
    }

}
