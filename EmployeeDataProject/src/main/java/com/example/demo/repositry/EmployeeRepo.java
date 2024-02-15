package com.example.demo.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
