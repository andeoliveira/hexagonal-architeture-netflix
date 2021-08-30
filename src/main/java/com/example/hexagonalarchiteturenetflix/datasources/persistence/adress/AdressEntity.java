package com.example.hexagonalarchiteturenetflix.datasources.persistence.adress;

import javax.persistence.*;

@Entity
@Table(name = "adress")
public class AdressEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "adress_sequence_generator")
    @SequenceGenerator(name = "adress_sequence_generator", sequenceName = "adress_sequence", allocationSize = 1)
    private Long id;

    @Column(name = "zip_code", nullable = false, length = 8)
    private String zipCode;

    @Column(name = "street", nullable = false, length = 60)
    private String street;


}
