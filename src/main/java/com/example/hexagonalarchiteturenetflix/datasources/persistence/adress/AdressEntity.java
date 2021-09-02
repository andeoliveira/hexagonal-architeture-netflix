package com.example.hexagonalarchiteturenetflix.datasources.persistence.adress;

import javax.persistence.*;

@Entity
@Table(name = "adress")
public class AdressEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "adress_sequence_generator")
    @SequenceGenerator(name = "adress_sequence_generator", sequenceName = "adress_sequence", allocationSize = 1)
    private Long id;

    @Column(name = "zip_code", nullable = false, length = 9)
    private String zipCode;

    @Column(name = "street", nullable = false, length = 60)
    private String street;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
