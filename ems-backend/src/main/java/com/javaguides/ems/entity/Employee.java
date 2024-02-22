package com.javaguides.ems.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first-name")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "email_id",nullable = false, unique = true)
    private String email;
}


// public class Employee {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;
//     @Column(name = "first-name")
//     private String firstName;
//     @Column(name = "lastName")
//     private String lastName;
//     @Column(name = "email_id",nullable = false, unique = true)
//     private String email;
// }
