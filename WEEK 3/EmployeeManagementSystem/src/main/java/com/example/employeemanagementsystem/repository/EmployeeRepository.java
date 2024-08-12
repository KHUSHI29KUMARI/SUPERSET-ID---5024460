package com.example.employeemanagementsystem.repository;

import com.example.employeemanagementsystem.dto.EmployeeDTO;
import com.example.employeemanagementsystem.projection.EmployeeProjection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository<Employee> extends JpaRepository<Employee, Long> {
    
    @Query("SELECT e.firstName AS firstName, e.lastName AS lastName, d.name AS departmentName " +
           "FROM Employee e JOIN e.department d WHERE d.name = :departmentName")
    List<EmployeeProjection> findByDepartmentName(@Param("departmentName") String departmentName);

    @Query("SELECT new com.example.employeemanagementsystem.dto.EmployeeDTO(e.firstName, e.lastName, d.name) " +
           "FROM Employee e JOIN e.department d WHERE d.name = :departmentName")
    List<EmployeeDTO> findDTOByDepartmentName(@Param("departmentName") String departmentName);
}
