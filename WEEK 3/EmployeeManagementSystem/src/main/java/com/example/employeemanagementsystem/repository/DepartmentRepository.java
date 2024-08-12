package com.example.employeemanagementsystem.repository;

import com.example.employeemanagementsystem.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

    // Custom query to find a department by name
    @Query("SELECT d FROM Department d WHERE d.name = :name")
    Department findByName(@Param("name") String name);
}
