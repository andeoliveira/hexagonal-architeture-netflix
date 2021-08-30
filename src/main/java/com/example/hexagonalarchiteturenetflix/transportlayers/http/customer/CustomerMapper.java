package com.example.hexagonalarchiteturenetflix.transportlayers.http.customer;

import com.example.hexagonalarchiteturenetflix.entities.customer.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    CustomerDTO custumerToCustumerDTO(Customer customer);

    Customer custumerDTOToCustomer(CustomerDTO customerDTO);

    CustomerRequest custumerToCustomerRequest(Customer customer);

    Customer customerRequestToCustomer(CustomerRequest customerRequest);


}
