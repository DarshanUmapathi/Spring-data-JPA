package com.springdatajpa.demo.controller;

import com.springdatajpa.demo.model.Employee;
import com.springdatajpa.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RestController
public class EmployeeController {


    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee emp) {
        System.out.println("Req body" + emp);
        return employeeService.saveEmployee(emp);
    }

//    @PostMapping("/addProducts")
//    public List<Product> addProducts(@RequestBody List<Product> products) {
//        return service.saveProducts(products);
//    }

    @GetMapping("/employees")
    public List<Employee> findAllEmployees() {
        return employeeService.getEmployees();
    }

    @GetMapping("/employeeById/{id}")
    public Optional<Employee> findProductById(@PathVariable int id) {
        return employeeService.getEmployeesId(id);
    }
}
