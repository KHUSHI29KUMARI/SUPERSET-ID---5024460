package com.di.example.test;

import com.di.example.repository.CustomerRepository;
import com.di.example.repository.CustomerRepositoryImpl;
import com.di.example.service.CustomerService;

public class DependencyInjectionTest {
    public static void main(String[] args) {
        // Create the repository
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        // Inject the repository into the service
        CustomerService customerService = new CustomerService(customerRepository);

        // Use the service to find a customer
        String customer = customerService.getCustomer("1");
        System.out.println("Found customer: " + customer);
    }
}
