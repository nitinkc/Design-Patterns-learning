package com.uml.a2association.oneWay;

import java.util.List;

// Example of multiplicity in a relationship
public class Department {
    // Field representing one-to-many relationship with Employee class
    private List<Employee> employees;

    // Constructor
    public Department(List<Employee> employees) {
        this.employees = employees;
    }

    // Method to add an employee to the department
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Method to remove an employee from the department
    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    // Method to get all employees in the department
    public List<Employee> getEmployees() {
        return employees;
    }
}
