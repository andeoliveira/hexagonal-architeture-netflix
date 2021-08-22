package com.example.hexagonalarchiteturenetflix.repositories.adress;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity
@Table(name = "adress")
public class AdressEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "adress_sequence_generator")
    @SequenceGenerator(name = "adress_sequence_generator", sequenceName = "adress_sequence", allocationSize = 1)
    private Long id;

    @Column(name = "register_date", nullable = false)
    private LocalDateTime registerDate;

    @Column(name = "zipe_code", nullable = false, length = 8)
    private BigInteger zipeCode;

    @Column(name = "street", nullable = false, length = 200)
    private String street;

    @Column(name = "district", nullable = false, length = 200)
    private String district;

    @Column(name = "city", nullable = false, length = 200)
    private String city;
}
