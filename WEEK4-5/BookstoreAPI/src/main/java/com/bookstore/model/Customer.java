package com.bookstore.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Name is required")
    private String name;

    @NotNull(message = "Email is required")
    private String email;

    private String phone;

    @Version
    private int version;

    // Getters and setters
}
