package com.example;

import org.springframework.stereotype.Service;

@Service
public class EmployeService {

    public void addEmployee() {
        System.out.println("Employee added: Sathya");
    }

    public void displayEmployee() {
        System.out.println("Employee ID: 101");
        System.out.println("Employee Name: Sathya");
    }

    public void calculateSalary() {
        System.out.println("Employee Salary: 25000.0");
    }
}

