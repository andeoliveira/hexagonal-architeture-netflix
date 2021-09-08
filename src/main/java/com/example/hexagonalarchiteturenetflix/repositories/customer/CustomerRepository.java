package com.example.hexagonalarchiteturenetflix.repositories.customer;

import com.example.hexagonalarchiteturenetflix.entities.customer.Customer;

import java.util.Optional;

public interface CustomerRepository {

    Customer create(Customer customer);

    Optional<Customer> getCustomer(Long id);
}
