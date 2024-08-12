package com.example.employeemanagementsystem.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.example.employeemanagementsystem.dto.EmployeeDTO;
import com.example.employeemanagementsystem.model.Employee;
import com.example.employeemanagementsystem.projection.EmployeeProjection;
import com.example.employeemanagementsystem.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository<?> employeeRepository;

    public List<EmployeeProjection> getEmployeesByDepartmentName(String departmentName) {
        return employeeRepository.findByDepartmentName(departmentName);
    }

    public List<EmployeeDTO> getEmployeeDTOsByDepartmentName(String departmentName) {
        return employeeRepository.findDTOByDepartmentName(departmentName);
    }

	public Page<Employee> getEmployees(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}
}
