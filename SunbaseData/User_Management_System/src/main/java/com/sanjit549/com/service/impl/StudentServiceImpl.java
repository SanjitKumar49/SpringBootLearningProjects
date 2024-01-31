package com.sanjit549.com.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sanjit549.com.entity.Student;
import com.sanjit549.com.repository.StudentRepository;
import com.sanjit549.com.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;

	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {

		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {

		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(long id) {

		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);
	}

}
