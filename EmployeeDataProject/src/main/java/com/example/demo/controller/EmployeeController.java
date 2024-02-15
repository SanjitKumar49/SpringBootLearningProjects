package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.repositry.EmployeeRepo;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeRepo employeeRepo;

	public EmployeeController(EmployeeRepo employeeRepo) {
		super();
		this.employeeRepo = employeeRepo;
	}

// Get All Employee Details
	@GetMapping(path = "/getEmployee")
	public List<Employee> getEmployees() {
		return employeeRepo.findAll();

	}

//Add Student Details
	@PostMapping(path = "/addEmployee")
	public Employee addStudent(@RequestBody Employee employee) {
		employeeRepo.save(employee);
		return employee;
	}

	@DeleteMapping("/employee/{id}")
	public String deleteEmployee(@PathVariable int id) {

		@SuppressWarnings("deprecation")
		Employee obj = employeeRepo.getOne(id);
		employeeRepo.delete(obj);
		return "deleted";

	}

	// Update Employee Details by Student Details
	@PutMapping(path = "/updateEmployee")
	public Employee saveOrUpdateStudent(@RequestBody Employee employee) {
		employeeRepo.save(employee);
		return employee;
	}

	// Get Employee Details By Reg id
	@RequestMapping("/employee/{id}")
	public Optional<Employee> getStudent(@PathVariable("id") int id) {
		return employeeRepo.findById(id);

	}

}
