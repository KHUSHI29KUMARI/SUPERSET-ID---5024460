package com.example.demo;

import com.example.employeemanagementsystem.model.Employee;
import com.example.employeemanagementsystem.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class EmployeeRepositoryTests {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void testFindByDepartmentId() {
        List<Employee> employees = employeeRepository.findByDepartmentId(1L);
        assertEquals(2, employees.size()); // Assuming there are 2 employees in department 1
    }

    @Test
    public void testFindByEmail() {
        Employee employee = employeeRepository.findByEmail("test@example.com");
        assertEquals("John Doe", employee.getName());
    }
}


