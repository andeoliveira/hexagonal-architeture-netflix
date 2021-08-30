package com.example.hexagonalarchiteturenetflix.datasources.persistence.customeradress;

import com.example.hexagonalarchiteturenetflix.datasources.persistence.adress.AdressEntity;
import com.example.hexagonalarchiteturenetflix.datasources.persistence.customer.CustomerEntity;

import javax.persistence.*;

@Entity
@Table(name = "customer_adress")
public class CustomerAdressEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_adress_sequence_generator")
    @SequenceGenerator(name = "customer_adress_sequence_generator", sequenceName = "customer_adress_sequence", allocationSize = 1)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private CustomerEntity customer;

    @ManyToOne
    @JoinColumn(name = "adress_id", nullable = false)
    private AdressEntity adress;


}
