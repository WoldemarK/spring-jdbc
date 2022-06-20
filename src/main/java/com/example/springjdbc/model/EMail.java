package com.example.springjdbc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "email")
@AllArgsConstructor
@NoArgsConstructor
public class EMail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email",nullable = false, unique = true)
    private String email;
}
