package com.springdatajpa.demo.service;

import com.springdatajpa.demo.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    Employee saveEmployee(Employee emp);

    List<Employee> getEmployees();

    Optional<Employee> getEmployeesId(int id);
}
