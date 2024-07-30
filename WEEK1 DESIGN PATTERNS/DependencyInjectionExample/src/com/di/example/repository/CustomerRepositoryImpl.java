package com.di.example.repository;

import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {
    private Map<String, String> customers;

    public CustomerRepositoryImpl() {
        customers = new HashMap<>();
        customers.put("1", "John Doe");
        customers.put("2", "Jane Doe");
    }

    @Override
    public String findCustomerById(String id) {
        return customers.get(id);
    }
}
