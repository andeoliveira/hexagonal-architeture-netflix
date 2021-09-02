package com.example.hexagonalarchiteturenetflix.datasources.persistence.customer;

import com.example.hexagonalarchiteturenetflix.datasources.persistence.adress.AdressEntity;
import com.example.hexagonalarchiteturenetflix.datasources.persistence.adress.AdressJpaRepository;
import com.example.hexagonalarchiteturenetflix.datasources.persistence.customeradress.CustomerAdressEntity;
import com.example.hexagonalarchiteturenetflix.datasources.persistence.customeradress.CustomerAdressJpaRepository;
import com.example.hexagonalarchiteturenetflix.entities.adress.Adress;
import com.example.hexagonalarchiteturenetflix.entities.customer.Customer;
import com.example.hexagonalarchiteturenetflix.repositories.customer.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class CustomerDatasourcePersistence implements CustomerRepository {

    @Autowired
    CustomerJpaRepository customerJpaRepository;

    @Autowired
    AdressJpaRepository adressJpaRepository;

    @Autowired
    CustomerAdressJpaRepository customerAdressJpaRepository;

    @Override
    public Customer create(Customer customer) {
        var customerCreated = customerJpaRepository.save(CustomerMapperOut.INSTANCE.customerToCustomerEntity(customer));
        return CustomerMapperOut.INSTANCE.customerEntityToCustomer(customerCreated);
    }

    @Override
    public Optional<Customer> getCustomer(Long id) {
        return Optional.ofNullable(
                CustomerMapperOut.INSTANCE.customerEntityToCustomer(
                        customerJpaRepository.findById(id).orElse(null)
                )
        );
    }

    private AdressEntity create(Adress adress) {
        return null;
    }

    private CustomerAdressEntity create(CustomerEntity customerEntity, AdressEntity adressEntity) {
        return null;
    }
}
