package com.di.example.service;

import com.di.example.repository.CustomerRepository;

public class CustomerService {
    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public String getCustomer(String id) {
        return customerRepository.findCustomerById(id);
    }
}
