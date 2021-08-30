package com.example.hexagonalarchiteturenetflix.datasources.persistence.customer;

import com.example.hexagonalarchiteturenetflix.repositories.customer.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerDatasourcePersistence implements CustomerRepository {

    @Autowired
    CustomerJpaRepository customerJpaRepository;

    @Override
    public CustomerEntity save() {
        return null;
    }
}
