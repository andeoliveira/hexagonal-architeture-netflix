package com.example.hexagonalarchiteturenetflix.datasources.persistence.customer;

import com.example.hexagonalarchiteturenetflix.entities.customer.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    Customer customerEntityToCustomer(CustomerEntity customerEntity);

    CustomerEntity customerToCustomerEntity(Customer customer);

}
