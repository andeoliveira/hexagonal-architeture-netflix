package com.example.hexagonalarchiteturenetflix.datasources.db.customer;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "customer")
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_sequence_generator")
    @SequenceGenerator(name = "customer_sequence_generator", sequenceName = "customer_sequence", allocationSize = 1)
    private Long id;

    @Column(name = "first_name", nullable = false, length = 60)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 60)
    private String lastName;

    @Column(name = "birthDate", nullable = false)
    private LocalDate birthDate;

    @Column(name = "register_date", nullable = false)
    private LocalDateTime registerDate;

}
