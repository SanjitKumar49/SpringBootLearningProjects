package com.sanjit549.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.sanjit549.com.entity.Student;
import com.sanjit549.com.service.StudentService;

import ch.qos.logback.core.model.Model;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class StudentController {
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	@GetMapping("/students")
	public String listStududents(org.springframework.ui.Model model) {
	 model.addAttribute("students",studentService.getAllStudents());
	 return "students";
	}
	
	@GetMapping("/students/new")
	public String createStudentForm(org.springframework.ui.Model model) {
		Student student =new Student();
		model.addAttribute(student);
		return "create_student";
	}
	
	@PostMapping("/students")
	public String saveStudent( @ModelAttribute("student") Student student) {
		studentService.saveStudent(student);
		return"redirect:/students";
		
	}
	
	@GetMapping("/students/edit/{id}")
	public String  editStudentForm(@PathVariable Long id,org.springframework.ui.Model model) {
		model.addAttribute("student",studentService.getStudentById(id));
		return "edit_student";
		
	}
	
	
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id,
		@ModelAttribute("student") Student student,
		org.springframework.ui.Model model) {
		
		Student existingStudent = studentService.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setAddress(student.getAddress());
		existingStudent.setCity(student.getCity());
		existingStudent.setState(student.getState());

		existingStudent.setEmail(student.getEmail());
		existingStudent.setPhono(student.getPhono());
		
		studentService.updateStudent(existingStudent);
		return "redirect:/students";

	
			
		
	}
	
	@GetMapping("/students/{id}")
	public String deleteStuent(@PathVariable Long id){
		studentService.deleteStudentById(id);
		return "redirect:/students";
	}
	

}
