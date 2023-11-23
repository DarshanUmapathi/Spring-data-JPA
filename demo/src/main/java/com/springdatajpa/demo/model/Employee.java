package com.springdatajpa.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Setter
@Getter
@Table(name = "EMPLOYEE_TBL")
public class Employee {


    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String division;
    private String designation;
    private double salary;
}
