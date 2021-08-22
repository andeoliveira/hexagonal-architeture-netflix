package com.example.hexagonalarchiteturenetflix.repositories.person;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity
@Table(name = "person")
public class PersonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "person_sequence_generator")
    @SequenceGenerator(name = "person_sequence_generator", sequenceName = "person_sequence", allocationSize = 1)
    private Long id;

    @Column(name = "register_date", nullable = false)
    private LocalDateTime registerDate;

    @Column(name = "first_name", nullable = false, length = 80)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 80)
    private String lastName;

    @Column(name = "cpf", nullable = false, length = 11)
    private BigInteger cpf;

}
