package com.example.hexagonalarchiteturenetflix.transportlayers.http.customer;

import com.example.hexagonalarchiteturenetflix.entities.customer.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapperIn {

    CustomerMapperIn INSTANCE = Mappers.getMapper(CustomerMapperIn.class);

    CustomerDTO customerToCustomerDTO(Customer customer);

    //@Mapping(target = "adress.zipCode.", source = "zipCode")
    //@Mapping(target = "adress.street", source = "street")
    Customer customerRequestToCustomer(CustomerRequest customerRequest);

}
