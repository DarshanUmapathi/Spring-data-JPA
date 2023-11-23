package com.springdatajpa.demo.service;

import com.springdatajpa.demo.dao.EmployeeRepository;
import com.springdatajpa.demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepo;

    @Override
    public Employee saveEmployee(Employee emp) {
        return employeeRepo.save(emp);
    }

    @Override
    public List<Employee> getEmployees() {
        return employeeRepo.findAll();
    }

    @Override
    public Optional<Employee> getEmployeesId(int id) {
        return employeeRepo.findById(id);
    }
}
