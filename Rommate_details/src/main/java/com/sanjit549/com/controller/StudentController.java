package com.sanjit549.com.controller;

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

import com.sanjit549.com.dao.StudentDao;
import com.sanjit549.com.model.Student;

@RestController
public class StudentController {
	@Autowired
	StudentDao studentDao;
	
	// Add Student Details
	@PostMapping(path = "/addStudent")
	public Student addStudent(@RequestBody Student student) {
		studentDao.save(student);
		return student;
	}
	 
	//Delete Student Detail By Reg no
	@DeleteMapping("/Student/{id}")
	public String deleteStudent(@PathVariable int id)
	{
		@SuppressWarnings("deprecation")
		Student a = studentDao.getOne(id);
		studentDao.delete(a);
		return "deleted";
	}
	
	// Update Student Details by Student Details
	@PutMapping(path="/updateStudent")
	public Student saveOrUpdateStudent(@RequestBody Student student)
	{
	    studentDao.save(student);
		return student;
	}

	// Get All Student Details
	@GetMapping(path = "/getStudent")
	public List<Student> getStudents() {
		return studentDao.findAll();

	}

	// Get Student Details By Reg id
	@RequestMapping("/Student/{rg}")
	public Optional<Student> getStudent(@PathVariable("rg") int rg) {
		return studentDao.findById(rg);

	}

}
