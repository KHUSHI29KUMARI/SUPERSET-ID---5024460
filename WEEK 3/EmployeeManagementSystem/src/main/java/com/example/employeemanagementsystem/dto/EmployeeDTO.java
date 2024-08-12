package com.example.employeemanagementsystem.dto;

public class EmployeeDTO {
    private String firstName;
    private String lastName;
    private String departmentName;

    public EmployeeDTO(String firstName, String lastName, String departmentName) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setDepartmentName(departmentName);
    }

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

    // Getters and Setters
}
