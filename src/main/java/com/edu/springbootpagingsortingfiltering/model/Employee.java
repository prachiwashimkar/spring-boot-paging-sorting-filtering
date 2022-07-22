package com.edu.springbootpagingsortingfiltering.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="EMPLOYEE")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
}
