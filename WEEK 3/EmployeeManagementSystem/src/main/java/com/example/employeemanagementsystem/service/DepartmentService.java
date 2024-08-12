package com.example.employeemanagementsystem.service;

import com.example.employeemanagementsystem.model.Department;
import com.example.employeemanagementsystem.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department findDepartmentByName(String name) {
        return departmentRepository.findByName(name);
    }

    // Other service methods
}
