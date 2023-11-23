package com.springdatajpa.demo.dao;

import com.springdatajpa.demo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

//    @Override
//    Optional<User> findById(String username);
//
//    @Override
//    <S extends User> S save(S entity);
//
//    @Override
//    void delete(User entity);
}
